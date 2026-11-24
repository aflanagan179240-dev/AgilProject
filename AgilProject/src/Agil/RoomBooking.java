package Agil;
import java.util.HashSet;
public class RoomBooking {
		
	private HashSet<String> bookedRoooms = new HashSet<>();
	//the hash set stores or save the room that have been booked already
	// kinds woorks like an array in a sense
	public boolean bookRoom(int date,String floor, String roomType) {
		
		String room = date + ","+ floor + "," +roomType;
		if(bookedRoooms.contains(room)) {
			return false;
		}
		
		bookedRoooms.add(room);
		return true;
		
	}
}
