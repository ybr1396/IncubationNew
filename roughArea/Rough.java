package roughArea;



public class Rough {
	
	static void line() {
		for (int i = 0; i < 500; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	
	int id;
	String name;
	float salary;
	
	
	public Rough(int i, String n, int s) {
		id =i;
		name = n;
		salary = s;
		
	}

	public Rough() {
		
	}

	//public Rough(Rough r) {
		//id =r.id;
		//name = r.name;}
	
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}



	public static void main(String[] args) {
		
    Rough R1 = new Rough(111,"arun",9000);
    Rough R2 = new Rough();
    R2.id = R1.id;
    R2.name= R1.name;
    R2. salary = R1.salary;
    
    R1.display();
    R2.display();
    
	}

}
