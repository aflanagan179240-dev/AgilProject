package Agil;

public class CancelBooking {
	
	private RoomBooking booking;
	//Test for cancelBooking push failed
	public CancelBooking(RoomBooking booking) {
		this.booking= booking;
	}
	
	public boolean cancelRoom(int date,String floor,String roomType) {
		if(booking.removeBooking(date, floor, roomType)) {
			return true;
		}
		return false;
	}
	
}
