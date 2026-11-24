
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
    
    @Test
    public void testALreadyBookRoom() {
    	RoomBooking booking = new RoomBooking();
    	booking.bookRoom(15, "GroundFloor", "Single Room");
    	
    	boolean result = booking.bookRoom(15, "GroundFloor", "SingleRoom");
    	assertFalse(result);
    }
    
    @Test
    		public void  testBookRoomOnDifferentDay() {
    		RoomBooking  booking = new RoomBooking();
    	
    		booking.bookRoom(15, "GroundFloor", "SingleRoom");
    	
    		boolean result = booking.bookRoom(16, "GroundFloor","SingleRoom");
    		assertTrue(result);
 
    }
}
