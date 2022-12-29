package railway_reservation;

import java.util.*;

public class IRCTC {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = 0;
		do {
			System.out.println("Enter the option as 1.AvailableTicket 2.BookTicket 3.CancelTicket 4.MyBookings 5.Exit");
			a = sc.nextInt();
			switch(a)
			{
			case 1:
				Available_Tickets At = new Available_Tickets();
				At.Display();
				break;
			case 2:
				Book_Tickets Bt = new Book_Tickets();
				Bt.BookTickets();
				break;
			case 3:
				Cancellation Ct = new Cancellation();
				Ct.showDetails();
				break;
			case 4:
				My_Bookings Mb = new My_Bookings();
				Mb.DisplayTicket();
				break;
					
			}
		} 
		
		
		while(a!=5);
		
		System.out.println("Thank You!!!");

	}

}
