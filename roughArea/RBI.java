package roughArea;

abstract class RBI {
	
	abstract double getAnnualLiabilityofBanks();
	}
class PNB extends RBI{
	double getAnnualLiabilityofBanks(){return 7000000l;}    
}
class BOB extends RBI {
	double getAnnualLiabilityofBanks(){return 90000000l;}
	
}
	
	


