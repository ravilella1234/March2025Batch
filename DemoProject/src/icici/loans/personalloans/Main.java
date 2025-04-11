package icici.loans.personalloans;

public class Main 
{

	public static void main(String[] args) 
	{
		
		//Method Overloading Example Booking movie tickets
		
		MovieTicketBooking booking = new MovieTicketBooking();
        booking.bookTicket(25);
        booking.bookTicket(30, "Ravi");
        booking.bookTicket(45, "Pushpalatha", "7:30 PM");
        
       // Method Overriding Example Payment in different modes
       
        Payment payment;

        payment = new CardPayment(); // Dynamic method dispatch
        payment.pay(500);

        payment = new UpiPayment();
        payment.pay(1000);
        
        
	}

}
