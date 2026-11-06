
package Agil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testApplicationAccountSetup() {
        IDandPasswords accounts = new IDandPasswords();

        assertNotNull(accounts);
        assertNotNull(accounts.getLoginInfo());
    }
}

