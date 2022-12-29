package roughArea;
public class Customer 
{ 
	
 private int  CustId;	
 private String Name;
 private long Accountno;
 private double Balance;
 private String Password = "";
 
 
 Customer(int CustId,String name,long Accountno,double balance,String Password)
 {
	 this.CustId=CustId;
	 this.Name=name;
	 this.Accountno=Accountno;
	 this.Balance=balance;
	 for(int i=0;i<Password.length();i++) {
			int f=(int)Password.charAt(i)+1;
			this.Password+=(char)f;
		}
	 
	
	 Balance = 10000;
 }
 
 public String toString()
 {
	 return " " + this.CustId+":"+this.Name+":"+this.Accountno+":"+this.Balance+":"+this.Password;
 }

public int getCustId() {
	return CustId;
}

public void setCustId(int custId) {
	custId = CustId;
}

public String getName() 
 { 
    return Name; 
 } 
 public void setName(String CustomerName) 
 { 
   Name = CustomerName; 
  } 
 public long getAccountno() {
	return Accountno;
	 
 }
 public void setAccountno(long CustomerAccountno) {
	 Accountno = CustomerAccountno;
 }
public double getBalance() {
	return Balance;
}
public void setBalance(double CustomerBalance) {
	Balance = CustomerBalance;
}

public String getPassword() {
	String password="";
	for(int i=0;i<Password.length();i++) {
		int f=(int)Password.charAt(i)-1;
		password+=(char)f;
	}
	return Password;
}

public void setPassword(String password) {
	password = Password;
}

}
