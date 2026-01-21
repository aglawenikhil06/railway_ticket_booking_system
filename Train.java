package railwayTicketBooking;

public interface Train {

	public void getAvailableSeat();
	public void bookSeat(int seatNumber);
	public void cancelSeat(int cancelSeatNumber,Passanger p1);
	public void displayAllBookedSeat();
	public void updateSeatNo(Passanger p1);
	
}
