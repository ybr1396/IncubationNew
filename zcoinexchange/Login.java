package zcoinexchange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Login implements Comparator {

	private static int roll = 4;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Login = 1;

		User obj1 = new User(11, "Sathish", "sathish1997@gmail.com", "7895600360", 10000);
		User obj2 = new User(12, "Siva", "siva2000@gmail.com", "7905678230", 15000);
		User obj3 = new User(13, "Arun", "Arun2009@gmail.com", "8234567810", 12000);
		User obj4 = new User(14, "Velmurugan", "Velmurugan2006@gmail.com", "7867342390", 18000);

		ArrayList<User> UserList = new ArrayList<User>();
		UserList.add(obj1);
		UserList.add(obj2);
		UserList.add(obj3);
		UserList.add(obj4);

		System.out.println("UserList:" + UserList);
		Login l = new Login();

		Collections.sort(UserList, l);
		System.out.println("Top Users" + UserList);

		while (Login != 0) {

			System.out.println("1.User Login\n2.Register\n");

			Login = sc.nextInt();

			switch (Login) {
			case 1:
				System.out.println("Enter the Email_ID");
				String Email_id = sc.nextLine();

				System.out.println("Enter the password");
				String password1 = sc.next();

				for (User u : UserList) {
					if (Email_id == u.getEmail_id()) {
						String password = u.getPassword();
						if (password.equals(password)) {
//User obj = new User(u.getH_Id(), u.getName(), u.getRC_Deposit(), u.getMobilenumber(),
									//u.getPassword(), u.getEmail_id());

							//u.setRC_Deposit(obj.getRC_Deposit());

							break;
						} else {
							System.out.println("Invalid password");
							break;
						}
					}
				}
				break;

			case 2:
				System.out.println("Enter the Email_Id");
				String Email_id1 = sc.next();

				System.out.println("Enter the password");
				String regPassword = sc.next();
				System.out.println("re-Enter the password");
				String rePassword = sc.next();
				if (regPassword.equals(rePassword)) {
					User log = new User(Email_id1, regPassword);
					UserList.add(log);
					System.out.println("Account Created : " + log.getH_Id());
					roll++;

				} else {
					System.out.println("Password Mismatch");
				}

				break;
			}
		}
		//display();
	}

	/*
	 * private static void display() { for (User u : UserList) {
	 * System.out.println(u.getH_Id()+""+u.getEmail_id()+""+u.getMobilenumber());
	 * 
	 * }
	 */

	public int compare(Object o1, Object o2) {

		User c1 = (User) o1;
		User c2 = (User) o2;

		if (c1.getRC_Deposit() > c2.getRC_Deposit())
			return -1;
		else if (c1.getRC_Deposit() < c2.getRC_Deposit())
			return +1;
		else {
			if (c1.getH_Id() > c2.getH_Id()) {
				return +1;
			} else if (c2.getH_Id() > c1.getH_Id()) {
				return -1;
			}
		}

		return 0;
	}

}
