package railway_reservation;

public class Available_Tickets extends  Passenger_Details {
	
	void Display()
	{
		System.out.println("No of Upper Available :"+Upper);
		System.out.println("No of Lower Available :"+Lower);
		System.out.println("No of Middle Available:"+Middle);
		System.out.println("No of RAC Available   :"+RAC);
		System.out.println("No of WL Available    :"+WL);

	}

}
