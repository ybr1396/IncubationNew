package railway_reservation;

public class Book_Tickets extends Passenger_Details 
{
	static  int value=1;
	static  int Pnr = 1;
	static int count=0;
	static int AL=1;
	static Book_Tickets obj=new Book_Tickets();
	

	void BookTickets()
	{
		System.out.println("Enter the No of Tickets:");
		int n=PD.nextInt();
		if(n+AL<=11)
		{
			for(int i=0;i<n;i++)
			{
              PNR[count] = value;
              PD.nextLine();
              
              System.out.println("Enter the Passenger Name");
              String name = PD.nextLine();
              Name[count]=name;
              
              System.out.println("Enter the Passenger Age");
              int age = PD.nextInt();
              Age[count]=age;
              if(age>5)
            	  Allocation[count]=AL++;
              else
            	  Allocation[count]=0;
              
              System.out.println("Enter the Passenger Gender");
              String gender = PD.next();
              Gender[count] = gender;
              
              if(age>5)
            	  Fare[count]= 450;
              else
            	  Fare[count]=180;
              
              if(AL>7&&AL<=9) 
              {
            	Berth[count] = "RAC";
            	--RAC;
              }
              else if(AL>9 && AL<=11) 
              {
            	  Berth[count]="WL";
            	  Allocation[count]=0;
            	  --WL;
              }
              
              boolean check = false;
              if(TotalNoofBerth>0)
              {
            	  if(age>=60)
            	  {
            		  check = Lower!=0?true:false;
            		  if(check==true) 
            		  {
            			  Berth[count]="Lower";
            			  --Lower;
            			  --TotalNoofBerth;
            		  }
            		  else
            		  {
            		   System.out.println("No Lower Available");
                       obj.berthPreference(count);
            		  }
            	  }
            	  else
            	  {
            		  if(age>5)
            		  {
            			  obj.berthPreference(count);  
            		  }
            		  else
            			  Berth[count] = "No Berth";
            	  }
              }
	          ++count;
			}
			++value;
			System.out.println("Ticket Booked Sucessfully");
	     }
		else
			System.out.println("No ticket Available Check Availability");
	}
	
	void berthPreference(int count)
	{
		System.out.println("Enter the Berth Preference as 1.Lower 2.Middle 3.Upper");
		int pref = PD.nextInt();
		--TotalNoofBerth;
		switch(pref)
		{
		case 1:
			obj.lowerBerth(count);
			break;
		case 2:
			obj.middleBerth(count);
			break;
		case 3:
			obj.upperBerth(count);
			break;
		}
	}
	void lowerBerth(int count)
	{
		if(Lower!=0)
		{
			Berth[count]="Lower";
			--Lower;
		}
		else
			obj.upperBerth(count);
	}
	void upperBerth(int count)
	{
		if(Upper!=0)
		{
			Berth[count]="Upper";
			--Upper;
		}
		else
			obj.middleBerth(count);
	}	
	void middleBerth(int count)
	{
		if(Middle!=0)
		{
			Berth[count]="Middle";
			--Middle;
		}
		else
			obj.lowerBerth(count);
	}
}	
