package array;

import java.util.*;

public class Rough_Work {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");

		int size = sc.nextInt();
		
		int [] arr = new int[size];

		for(int i=0;i<size;i++) {
				arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After the Reverse of array:");
		for(int i = arr.length-1;i>=0;i--)
			System.out.print(arr[i]+",");
		
        int [] des1 = new int [arr.length];
        
        System.arraycopy(arr,0,des1,0,arr.length);
        System.out.println("\ndes1 ="+ Arrays.toString(des1));
		
		int [] des2 = Arrays.copyOfRange(arr, 2, 5);
		
		System.out.println("des2 ="+Arrays.toString(des2));
		
		
	}
}


























//  int j = arr.length-1;
//  while(j>=0) {
//	  
//  System.out.print(arr[j]+" ");
//  
//  j=j-1;
//
//}
//












































//int [] []arr = new int[size][size];
//boolean [] test = new boolean [size];
//
//for(int i =0; i<size ;i++) {
//
//	for(int j=0;j<size;j++) {
//		arr[i][j] = sc.nextInt();
//		//test[i] = sc.nextBoolean();
//	}
//}
//		//System.out.println(arr[0]);
//		System.out.println(Arrays.toString(arr));
//System.out.println(Arrays.toString(test));
//for(int i =0; i<size;i++) {
//	for(int j=0;j<size;j++) {
//
//		System.out.print(arr[i][j]+" ");
//		//test[i] = sc.nextBoolean();
//	}
//	System.out.println();
//}

//int binary = sc.nextInt();
//
//double decimal =0;
//int i=0;
// while(binary>0) {
//	 
//	 int rem = binary%10;
//	 decimal = decimal +(rem*Math.pow(2, i));
//	 
//	 binary = binary/10;
//	 i = i+1; 
// }
//System.out.println(decimal);
//int d = sc.nextInt();
//String binary = "";
//int rem =0;
//while(d>0) {
//	rem = d%2;
//	binary = rem + binary;
//	d = d/2;
//	
//}
//
//int count = 0;
//System.out.println(2);
//count = count+1;
//while(count<20) {
//	
//int n = sc.nextInt();
//int i = 2;
//
//while(i<n) {
//	
//	if(n%i==0) {
//		System.out.println("Not Prime");
//		boolean Prime =false;
//	}
//	i++;
//}
//
//boolean Prime = false;
//if(Prime==true) {
//	System.out.println(n+"is Prime");
//	count = count +1;
//}
//n=n+2;
//}	
//

//int i= 1;
//while(i<n) {
//	System.out.println(Math.pow(i, i));
//	i++;
//}



//int rem = 0;
//int n1;
//n1=n;
//while(n>0) {
//	
//	rem = (rem*10)+n%10;
//	n = n/10;	
//}
//if(rem==n1) {
//	System.out.println("The given Number is PALINDROME");}
//	else {
//		System.out.println("The given Number is Not PALINDROME");
//	}
//System.out.println(rem);
//	

//int fact = n;
//
//while(n>1) {
//	n--;
//	fact = fact*n;	
//}
//System.out.println(fact);
//


//int i=2;
//while(i<=n/2) {
//	
//	if(n/i==i) {
//		
//		System.out.println(i);
//		break;
//	}
//	i++;
//	
//}








//	
//	System.out.println("Enter the no1:");
//	int no1 = sc.nextInt();
//	System.out.println("Enter the no2:");
//	int no2 = sc.nextInt();
//	int lcm,Gcd = 0;
//	int min = no1<no2?no1:no2;
//	while(min>=2) {
//		if((no1%min==0)&&(no2%min==0)) {
//			Gcd=min;
//		}
//		min--;
//	}
//	
//	
//	int max = no1>no2?no1:no2;
//	while(true) {
//		if((max%no1==0)&&(max%no2==0)) {
//			 lcm = max;
//			break;
//		}
//		max++;
//		
//	}System.out.println("LCM "+lcm);
//	System.out.println("Gcd "+Gcd);
//	
//}

//HashMap<String,String> capitalsofstate = new HashMap<String,String>();
//
//
//capitalsofstate.put("Tamilnadu", "Chennai");
//capitalsofstate.put("Karnataka", "Bangalore");
//capitalsofstate.put("Telangana", "Hyderabad");
////capitalsofstate.remove("Karnataka");
//for(String i:capitalsofstate.keySet()) {
//	   
//	   System.out.println(i);
//}
//System.out.println(capitalsofstate);
//System.out.println(capitalsofstate.get("Tamilnadu"));	
//












//		
//		ArrayList<String> studentname = new ArrayList<String>();
//		studentname.add("Ram");
//		studentname.add("Siva");
//		studentname.add("Guru");
//		studentname.add("Ajith");
//		studentname.set(1, "Vishnu");
//		studentname.remove(2);
//		Collections.sort(studentname);
//		
//		for(String s:studentname) {
//			System.out.println(s);
//		}
//		
//for (int i = 0; i < studentname.size(); i++) {
//    System.out.println(studentname.get(i));}
//System.out.println(studentname.get(0));
//System.out.println(studentname);
//System.out.println();
//System.out.println(studentname.size());



