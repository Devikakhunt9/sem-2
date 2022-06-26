import java.util.Scanner;
class Bank_Accountdemo{
	String name;
	double actno;
	String email;
	String accounttype;
	double amount;
	
	void getdetails(){
	Scanner input = new Scanner(System.in);
	System.out.println("enter username:");
	name = input.nextLine();
	System.out.println("Enetr account no:");
	actno = input.nextDouble();
	System.out.println("enter email:");
	input.nextLine();
	email = input.nextLine();
	System.out.println("accounttype:");
	accounttype = input.nextLine();
	System.out.println("amount:");
	amount = input.nextDouble();
}
	void displaydetails(){
		System.out.println("Account Holder:"+name);
		System.out.println("Accountno:"+actno);
		System.out.println("Email:"+email);
		System.out.println("Account Type:"+accounttype);
		System.out.println("Amount:"+amount);
	}
}
class Lab5_4{
	public static void main(String[] args) {
		Bank_Accountdemo user = new Bank_Accountdemo();
		user.getdetails();
		System.out.println("======output==========");
		user.displaydetails();
	}
}