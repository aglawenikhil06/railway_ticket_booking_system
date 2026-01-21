package railwayTicketBooking;

import java.util.Scanner;

public class TrainImplemented implements Train {

	private  int seat[]=new int[20];
    
	@Override
	public void getAvailableSeat() {

	    System.out.println("Available Seats:");

	    for (int i = 0; i < seat.length; i++) {

	        if (seat[i] == 0) {                  // check seat is available or not
	            System.out.println((i + 1) + "  available");  
	        }else {
	        	System.out.println((i + 1) + " The seat is booked.");
	        }
	    }
	    System.out.println();
	}


	@Override
	public void bookSeat(int seatNumber) {

	    CheckAllException n = new CheckAllException();

	    // Validate seat number
	    if (seatNumber < 1 || seatNumber > seat.length) {
	        n.invalidSeatNumber(seatNumber);
	    }

	    int index = seatNumber - 1;

	    // Check if already booked
	    if (seat[index] == 1) {
	        n.seatAlreadyBooked(seatNumber);
	    } else {
	        seat[index] = 1;
	        System.out.println("Seat " + seatNumber + " booked successfully.");
	    }
	}

	@Override
	public void cancelSeat(int cancelSeatNumber,Passanger p1) {

	    CheckAllException n = new CheckAllException();

	    // Validate seat number
	    if (cancelSeatNumber < 1 || cancelSeatNumber > seat.length) {
	        n.invalidSeatNumber(cancelSeatNumber);
	    }

	    int index = cancelSeatNumber - 1;

	    // Check if seat is booked
	    if (seat[index] == 1) {
	        seat[index] = 0;
	        p1.setName("");
	        p1.setAge("");
	        p1.setSeatNum(0);
	        System.out.println("Seat " + cancelSeatNumber + " cancelled successfully.");
	    } else {
	        n.cancelEmptySeat(cancelSeatNumber);
	    }
	}

	@Override
	public void displayAllBookedSeat() {
		System.out.println("All Booked seat are");
		for (int i = 0; i < seat.length; i++) {
			if(seat[i]==1) {						//display only booked seat
				System.out.println((i + 1));
			}
		}
	}


	@Override
	public void updateSeatNo(Passanger p1) {
        Scanner sc=new Scanner(System.in);
       
        CheckAllException n = new CheckAllException();
		System.out.println("What was your previous seat number");
		int oldSeatNo=sc.nextInt();
		
		System.out.println("Which seat number do you want?");
		int newSeatNo=sc.nextInt();
		if (newSeatNo < 1 || newSeatNo > seat.length) {
	        n.invalidSeatNumber(newSeatNo);
	    }
		
		if(seat[newSeatNo-1] == 0) {
			seat[oldSeatNo-1]=0;
			seat[newSeatNo-1]=1;
			System.out.println("Seat "+newSeatNo+" are updated sucessfully");
			p1.setSeatNum(newSeatNo);
			System.out.println(p1.getSeatNum());
		}else {
			n.seatAlreadyBooked(newSeatNo);
		}
		
		
	
	}
	

	
}
