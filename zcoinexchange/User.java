package zcoinexchange;

public class User {
	private int H_Id;
	private String Name;
	private double RC_Deposit;
	private String Email_id;
	private String Mobilenumber;
	private String Password = "";

	User( int H_Id, String Name,String Email_id, String Mobilenumber, double RC_Deposit) {
		this.H_Id = H_Id;
		this.Name = Name;
		this.Email_id = Email_id;
		this.RC_Deposit = RC_Deposit;
		this.Mobilenumber = Mobilenumber;

		for (int i = 0; i < Password.length(); i++) {
			int f = (int) Password.charAt(i) + 1;
			this.Password += (char) f;
		}
	}

	public User(String email_id1, String regPassword) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [H_Id=" + H_Id + ", Name=" + Name + ", Email_id=" + Email_id + ", RC_Deposit=" + RC_Deposit
				+ ", Mobilenumber=" + Mobilenumber + ", Password=" + Password + "]";
	}

	public int getH_Id() {
		return H_Id;
	}

	public void setH_Id(int H_Id) {
		H_Id = H_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}

	public double getRC_Deposit() {
		return RC_Deposit;
	}

	public void setRC_Deposit(double rC_Deposit) {
		RC_Deposit = rC_Deposit;
	}

	public String getMobilenumber() {
		return Mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		Mobilenumber = mobilenumber;
	}

	public String getPassword() {
		return Password;
	}

	public String setPassword(String password) {
		String password1 = "";
		for (int i = 0; i < Password.length(); i++) {
			int f = (int) Password.charAt(i) - 1;

			password1 += (char) f;
		}
		return Password;
	}

}
