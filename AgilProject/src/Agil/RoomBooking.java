package Agil;
import java.util.HashSet;
public class RoomBooking {
		
	private HashSet<String> bookedRoooms = new HashSet<>();
	//the hash set stores or save the room that have been booked already
	// kinds woorks like an array in a sense
	public String createRoomKey(int date,String floor, String roomType) {
		
		
		return date + "," + floor+ "," +roomType; 
		
		
	}
	
	public boolean bookRoom(int date,String floor,String roomType) {
	
	
		
		return bookedRoooms.add(createRoomKey(date,floor,roomType)) ;
	}
	public boolean removeBooking (int date,String floor,String roomType) {
		return bookedRoooms.remove(createRoomKey(date,floor,roomType));
		}
		
	}

