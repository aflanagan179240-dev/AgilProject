
package Agil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.swing.SwingUtilities;

public class AvailableRoomsTest {

    @Test
    void testRoomTypes() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            AvailableRooms rooms =
                new AvailableRooms("Booking");

            try {
                assertEquals(4, rooms.typesOfRooms.length);
                assertTrue(rooms.typesOfRooms[0]
                              .contains("SingleRoom"));
            } finally {
                rooms.dispose();
            }
        });
    }

    @Test
    void testFloorOptions() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            AvailableRooms rooms =
                new AvailableRooms("Booking");

            try {
                assertEquals(4, rooms.theFloor.length);
                assertEquals("GroundFloor",
                             rooms.theFloor[0]);
            } finally {
                rooms.dispose();
            }
        });
    }

    @Test
    void testCheckoutTimes() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            AvailableRooms rooms =
                new AvailableRooms("Booking");

            try {
                assertEquals(4,
                             rooms.checkOutTimes.length);
                assertEquals("9:00 AM",
                             rooms.checkOutTimes[0]);
            } finally {
                rooms.dispose();
            }
        });
    }
}
