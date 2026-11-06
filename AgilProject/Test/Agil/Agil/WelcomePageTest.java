
package Agil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.swing.SwingUtilities;

public class WelcomePageTest {

    @Test
    void testWelcomeMessage() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            WelcomePage page = new WelcomePage("student1");

            try {
                assertEquals("Hellostudent1",
                             page.welcomeLabel.getText());
            } finally {
                page.frame.dispose();
            }
        });
    }

    @Test
    void testWelcomeWindowVisible() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            WelcomePage page = new WelcomePage("student1");

            try {
                assertTrue(page.frame.isVisible());
            } finally {
                page.frame.dispose();
            }
        });
    }
}
