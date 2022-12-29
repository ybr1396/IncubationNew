package today;

public class Rectangle {
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;	
	}
	
	int area() {
		int area = length*breadth;
		return area;
		
	}

	public static void main(String[] args) {
		
		  {
			 Rectangle R = new Rectangle(4, 5) ;
			 System.out.println(R.area());
			 Rectangle R1= new Rectangle(5,8);
			 System.out.println(R1.area());
			 
		 }

	}

}
