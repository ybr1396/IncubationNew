package roughArea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Bank extends Rough implements Comparator
{

//{ float getRateOfInterest(){return 0;} 
 
 public static void main(String[] args) 
 { 
	Customer obj1 = new Customer(11,"Kumar",1001,10000,"KRty23");
    Customer obj2 = new Customer(12,"Madhu",1002,10000,"UMvb54");
    Customer obj3 = new Customer(13,"Rahul",1003,10000,"HRjk87");
    Customer obj4 = new Customer(14,"Robin",1004,10000,"IRfs21");
    
    ArrayList<Customer> CustomerList = new ArrayList<Customer>();
    CustomerList.add(obj1);
    CustomerList.add(obj2);
    CustomerList.add(obj3);
    CustomerList.add(obj4);
    line();
    System.out.println("CustomerList:"+ CustomerList);
    Bank b = new Bank();
    line();
    Collections.sort(CustomerList, b);
    System.out.println("Top Customers"+CustomerList);
    line();
   
    }

@Override
public int compare(Object o1, Object o2) {
	
	Customer c1 = (Customer)o1;
	Customer c2 = (Customer)o2;
	
	
	if(c1.getBalance()>c2.getBalance())
		return -1;
	else if (c1.getBalance()<c2.getBalance())
		return +1;
	else {
		if(c1.getCustId()>c2.getCustId()) {
			return +1;
		}
		else if(c2.getCustId()>c1.getCustId())
		{
			return -1;
		}
	}
	
	
	return 0;
} 
}






























//
//line();
//int  CustId1 = obj1.getCustId();
//String CustomerName1 = obj1.getName(); 
//long CustomerAccountno1 = obj1.getAccountno();
//double Balance1 = obj1.getBalance();
//String Password1 = obj1.getPassword();
//System.out.println(CustId1+"\n"+CustomerName1+"\n"+CustomerAccountno1+"\n"+Balance1+"\n"+Password1);
// 
// line();
// int  CustId2 = obj2.getCustId();
// String CustomerName2 = obj2.getName(); 
// long CustomerAccountno2 = obj2.getAccountno();
// double Balance2 = obj2.getBalance();
// String Password2 = obj2.getPassword();
// System.out.println(CustId2+"\n"+CustomerName2+"\n"+CustomerAccountno2+"\n"+Balance2+"\n"+Password2);
// 
// line();
// int  CustId3 = obj3.getCustId();
// String CustomerName3 = obj3.getName(); 
// long CustomerAccountno3 = obj3.getAccountno();
// double Balance3 = obj3.getBalance();
// String Password3 = obj3.getPassword();
// System.out.println(CustId3+"\n"+CustomerName3+"\n"+CustomerAccountno3+"\n"+Balance3+"\n"+Password3);
// 
// line();
// 
// int  CustId4 = obj4.getCustId();
// String CustomerName4 = obj4.getName(); 
// long CustomerAccountno4 = obj4.getAccountno();
// double Balance4 = obj4.getBalance();
// String Password4 = obj4.getPassword();
// System.out.println(CustId4+"\n"+CustomerName4+"\n"+CustomerAccountno4+"\n"+Balance4+"\n"+Password4);
// 
// line();
// 

