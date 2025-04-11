package icici.loans.personalloans;

public class MovieTicketBooking 
{
	
	// Booking with just seat number
    void bookTicket(int seatNumber) {
        System.out.println("Ticket booked for seat: " + seatNumber);
    }

    // Booking with seat number and name
    void bookTicket(int seatNumber, String name) {
        System.out.println("Ticket booked for " + name + " at seat: " + seatNumber);
    }
    
   
    // Booking with seat number, name, and time
    void bookTicket(int seatNumber, String name, String time) {
        System.out.println("Ticket booked for " + name + " at seat " + seatNumber + " for show at " + time);
    }

}
