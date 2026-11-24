
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
   
    @Test
    public void testCancelUnBookedRoom() {
    	RoomBooking booking  = new RoomBooking();
    	CancelBooking cancel = new CancelBooking(booking);
    	boolean result = cancel.cancelRoom(15, "GroundFloor", "SingleRoom");
    	
    		assertFalse(result);
    }
    
    		@Test
    		public void testCancelRoomTwice() {
    			RoomBooking booking = new RoomBooking();
    			booking.bookRoom(15, "GroundFloor", "SingleRoom");
    			CancelBooking  cancel = new CancelBooking(booking);
    			cancel.cancelRoom(15,"GroundFloor","SingleRoom");
    			boolean result = cancel.cancelRoom(15, "GroundFloor", "SingleRoom");
    			
    			assertFalse(result);
    		}
    		@Test
    		public void testBookRoomAfterCancellation() {
    			RoomBooking booking = new RoomBooking ();
    			booking.bookRoom(15, "GroundFloor", "SingleRoom");
    			CancelBooking cancel = new CancelBooking(booking);
    			cancel.cancelRoom(15, "GroundFloor", "SingleRoom");
    			boolean result = booking.bookRoom(15, "GroundFloor", "SingleRoom");
    			assertTrue(result);
    		}
}
