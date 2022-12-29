package today;

public class Student {
	String name ="John";
	int rollno = 2;
	
	Student (String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}

	public static void main(String[] args) {
		
		Student s = new Student("John",2);
		System.out.println(s.name);
		System.out.println(s.rollno);
	}

}
