
package Agil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.swing.SwingUtilities;
import java.util.HashMap;

public class LoignPageAgilTest {

    @Test
    void testWrongUsername() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            HashMap<String, String> accounts = new HashMap<>();
            accounts.put("student1", "12345");

            LoignPageAgil page = new LoignPageAgil(accounts);

            try {
                page.username.setText("wronguser");
                page.password.setText("12345");
                page.login.doClick();

                assertEquals("Username not found",
                             page.message.getText());
            } finally {
                page.dispose();
            }
        });
    }

    @Test
    void testWrongPassword() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            HashMap<String, String> accounts = new HashMap<>();
            accounts.put("student1", "12345");

            LoignPageAgil page = new LoignPageAgil(accounts);

            try {
                page.username.setText("student1");
                page.password.setText("wrong");
                page.login.doClick();

                assertEquals("Wrong password",
                             page.message.getText());
            } finally {
                page.dispose();
            }
        });
    }

    @Test
    void testResetButton() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            LoignPageAgil page =
                new LoignPageAgil(new HashMap<>());

            try {
                page.username.setText("student1");
                page.password.setText("12345");
                page.reset.doClick();

                assertEquals("", page.username.getText());
                assertEquals("", new String(
                    page.password.getPassword()));
            } finally {
                page.dispose();
            }
        });
    }
}
