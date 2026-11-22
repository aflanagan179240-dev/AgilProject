
package Agil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoomBookingTest {

    @Test
    public void testBookAvailableRoom() {

        RoomBooking booking = new RoomBooking();

        boolean result = booking.bookRoom(
            15, "GroundFloor", "SingleRoom"
        );

        assertTrue(result);
    }
}
