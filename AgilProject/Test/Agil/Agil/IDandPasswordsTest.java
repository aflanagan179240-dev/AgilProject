
package Agil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class IDandPasswordsTest {

    @Test
    void testLoginInfoStartsEmpty() {
        IDandPasswords accounts = new IDandPasswords();

        assertTrue(accounts.getLoginInfo().isEmpty());
    }

    @Test
    void testAddAccount() {
        IDandPasswords accounts = new IDandPasswords();

        HashMap loginInfo = accounts.getLoginInfo();
        loginInfo.put("student1", "password123");

        assertEquals("password123",
                     loginInfo.get("student1"));
    }

    @Test
    void testInvalidUsername() {
        IDandPasswords accounts = new IDandPasswords();

        assertFalse(accounts.getLoginInfo()
                            .containsKey("unknown"));
    }
}
