package roughArea;



class SBI extends Bank{
	float getRateOfInterest(){return 8;}  
}
class HDFC extends Bank{
	float getRateOfInterest(){return 6.5f;}  
	
}
class Axis extends Bank{
	float getRateOfInterest(){return 7.3f;}  
}
class ICICI extends Bank{
	float getRateOfInterest(){return 7;}  
}

public class BankAssociation  {
	
	
	public static void main(String[] args) {
		
		SBI s = new SBI();
		HDFC h = new HDFC();
		Axis a = new Axis();
		ICICI i = new ICICI();
		System.out.println( "SBI Rate of Interest: "+s.getRateOfInterest());
		System.out.println( "HDFC Rate of Interest: "+h.getRateOfInterest());
		System.out.println( "Axis Rate of Interest: "+a.getRateOfInterest());
		System.out.println( "ICICI Rate of Interest: "+i.getRateOfInterest());
				
	}

}