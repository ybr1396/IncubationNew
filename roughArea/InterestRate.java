package roughArea;

class InterestRate extends Rough  {
	 void sum(float Q,float H){System.out.println(Q+H);}  
	 void sum(float Q,int H ,float A){System.out.println(Q+H+A);}  

	public static void main(String[] args) {
		InterestRate IR = new InterestRate();
		IR.sum(7f,7.5f );
		IR.sum(7.3f, 8, 8.3f);
		
		line();
		
		RBI R;
		R = new PNB();
		System.out.println("Total amount of LIABILITY"+" "+ R.getAnnualLiabilityofBanks()+" "+"in Rupees");
		R = new BOB();
		System.out.println("Total amount of LIABILITY"+" "+ R.getAnnualLiabilityofBanks()+" "+"in Rupees");

	}

}
