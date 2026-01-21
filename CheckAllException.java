package railwayTicketBooking;



public class CheckAllException {

	public void invalidSeatNumber(int seatNumber) {
		throw new SeatNotAvailableException("Invalid seat number: " + seatNumber + ". Please choose a seat between 1 to 20.");
	}
	
	public void seatAlreadyBooked(int seatNumber) {
		throw new SeatNotAvailableException( "Seat " + seatNumber + " is already booked.");

	}
	
	public void cancelEmptySeat(int seatNumber) {
		throw new SeatNotAvailableException("Seat " + seatNumber + " is not booked, cannot cancel.");

	}
	
//	public void invalidName(String name) {
//		if(name.isEmpty() || name==null ) {
//			throw new userException("Name cannot be blank");
//		}
//
//	}
}
