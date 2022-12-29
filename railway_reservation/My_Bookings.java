package railway_reservation;

public class My_Bookings extends Passenger_Details {
	
	void DisplayTicket()
	{
		System.out.print("PNR\tName\tAge\tGender\tBerth\tFare\n");
		for(int i=0;i<Name.length;i++)
		{	
			if(Fare[i]!=0 && Gender[i]!="null")
			{
				System.out.print(PNR[i]+"\t"+Name[i]+"\t"+Age[i]+"\t"+Gender[i]+"\t"+Berth[i]+"\t"+Fare[i]+"\n");
			}
		}
	}

}
