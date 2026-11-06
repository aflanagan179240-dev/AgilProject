
package Agil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import javax.swing.SwingUtilities;

public class CreateAnAccountTest {

    private void testValidation(
            HashMap<String, String> accounts,
            String user, String pass,
            String confirm, String expected)
            throws Exception {

        SwingUtilities.invokeAndWait(() -> {
            CreateAnAccount page =
                new CreateAnAccount(accounts);

            try {
                assertEquals(expected,
                    page.validateAccount(
                        user, pass, confirm));
            } finally {
                page.dispose();
            }
        });
    }

    @Test
    void testEmptyUsername() throws Exception {
        testValidation(new HashMap<>(),
            "", "12345", "12345",
            "Enter a username and password.");
    }

    @Test
    void testPasswordsDoNotMatch() throws Exception {
        testValidation(new HashMap<>(),
            "student1", "12345", "54321",
            "Passwords do not match.");
    }

    @Test
    void testDuplicateUsername() throws Exception {
        HashMap<String, String> accounts = new HashMap<>();
        accounts.put("student1", "12345");

        testValidation(accounts,
            "student1", "12345", "12345",
            "That username is already taken.");
    }

    @Test
    void testValidAccountDetails() throws Exception {
        testValidation(new HashMap<>(),
            "student2", "12345", "12345",
            "Valid");
    }
}
