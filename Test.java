package railwayTicketBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static Passanger passengerInformation() {
	    Scanner sc = new Scanner(System.in);
	
	    System.out.println("Enter passenger detail");

	    System.out.println("Enter name:");
	    String name = sc.next();

	    System.out.println("Enter age:");
	    String age = sc.next();

	    System.out.println("Enter seat number:");
	    int seatNumber = sc.nextInt();

	    return new Passanger(name, age, seatNumber);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TrainImplemented t1=new TrainImplemented();
//		System.out.println("LogIn ");
		System.out.println("--------= Train Ticket Booking ---------");
		System.out.println("| From:        Pune Station            |");
		System.out.println("| TO:        Bangalore Station         |");
		System.out.println("----------------------------------------");
		
		String c;
		Passanger p =new Passanger(); 
		ArrayList<Passanger> passengerList = new ArrayList<>();

		do {
		    System.out.println("--------------------------------------");
		    System.out.println("Enter 1 to See Available Seats");
		    System.out.println("Enter 2 for Ticket Booking");
		    System.out.println("Enter 3 for Ticket Cancellation");
		    System.out.println("Enter 4 to View Passenger Details");
		    System.out.println("Enter 5 to Display All Booked Seats");
		    System.out.println("Enter 6 to Update Seat number");
		    System.out.println("--------------------------------------");

		    System.out.print("Enter your choice: ");
		    int choice = sc.nextInt();

			switch (choice) {
	
			    case 1:
				        try {
				            t1.getAvailableSeat();
				        } catch (SeatNotAvailableException e) {
				            System.out.println(e.getMessage());
				        }
				        break;
	
			    case 2:
				        System.out.println("How many tickets would you like to book?");
				        int n = sc.nextInt();
		
				        for (int i = 1; i <= n; i++) {
				            p = passengerInformation();
				            boolean booked = false;
                            int count=0;
				            while (!booked && count<3) {
				                try {
				                    t1.bookSeat(p.getSeatNum());
				                    passengerList.add(p);
				                    booked = true;  // success -> exit loop
				                } 
				                catch (SeatNotAvailableException e) {
				                    System.out.println(e.getMessage());
				                    count++;
				                    System.out.print("Please enter a valid seat number again: ");
				                    int seatNo = sc.nextInt();
				                    p.setSeatNum(seatNo);   // update passenger object
				                }
				               
				            }
				            if(count==3)
				            	System.out.println("Your attempts have exceeded. Try again later.");
				        }
				        break;
	
			    case 3:
				        System.out.print("Enter seat number to cancel: ");
				        int cancelSeat = sc.nextInt();
		
				        try {
				            t1.cancelSeat(cancelSeat,p);
				            
				        } catch (SeatNotAvailableException e) {
				            System.out.println(e.getMessage());
				        }
				        break;
	
			    
			    case 4:
			        if (passengerList.size() > 0) {
			            
			            System.out.println("All Passenger Details:");
			            System.out.println("----------------------------------");

			            for (Passanger px : passengerList) {
			                System.out.println("Name: " + px.getName());
			                System.out.println("Age: " + px.getAge());
			                System.out.println("Seat Number: " + px.getSeatNum());
			                System.out.println("----------------------------------");
			            }

			        } else {
			            System.out.println("No passengers booked yet!");
			        }
			        
			        break;

	
			    case 5:
				        try {
				            t1.displayAllBookedSeat();
				        } catch (SeatNotAvailableException e) {
				            System.out.println(e.getMessage());
				        }
				        break;
	
			    case 6:
			    	    
				    	boolean booked = false;
			            while (!booked) {
			                try {
			                    t1.updateSeatNo(p);
			                    booked = true;  // success -> exit loop
			                } 
			                catch (SeatNotAvailableException e) {
			                    System.out.println(e.getMessage()); 
			                }
			            }
				        break;
	
			    default:
			        	System.out.println("Invalid choice!");
			}

		    System.out.println("--------------------------------------");
		    System.out.print("Do you want to continue? (yes/no): ");
		    c = sc.next();

		} while (c.equalsIgnoreCase("yes") || c.equalsIgnoreCase("Yes"));

	}
}
