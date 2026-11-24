
package Agil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCancelBooking {
	//test Red failed
    @Test
    public void testCancelBookedRoom() {

        RoomBooking booking = new RoomBooking();

        booking.bookRoom(15, "GroundFloor", "SingleRoom");

        CancelBooking cancel = new CancelBooking(booking);

        boolean result = cancel.cancelRoom(
            15, "GroundFloor", "SingleRoom"
        );

        assertTrue(result);
    }
}
