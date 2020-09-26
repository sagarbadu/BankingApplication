import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name: ");
		String name = "Sagar";
		Scanner scan = new Scanner(System.in);
		String nxt = scan.nextLine();
		
		while (!nxt.equals(name)) {
			 System.out.println("Enter your name:");
			nxt = scan.nextLine();	
		 }
		System.out.println("Enter your Password: ");
		String password =  "Danger";
		Scanner nxtln = new Scanner(System.in);
		String pass = nxtln.nextLine();
		
		
	    while(!pass.equals(password)) {
		
		System.out.println("Enter your Password: ");
		pass = nxtln.nextLine();
	}
	  System.out.println("Welcome " + name);
	 
bankAccount obj1 = new bankAccount();
obj1.showMenu();
	}
	
}

class bankAccount{
	int balance;
	int previousTransaction;
	
	
	void deposit(int amount) {
		if(amount != 0)
		{
			balance = balance + amount;
			previousTransaction = -amount;
		}
	}
	void withdraw(int amount) {
		if(amount!= 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	void getPreviousTrans() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: "+ previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transaction occured");
		}
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		
		
		do {
			System.out.println("*****************************************");
			System.out.println("Enter an option");
			System.out.println("*****************************************");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("************************************");
				System.out.println("Balance = " + balance);
				System.out.println("************************************");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("************************************");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("************************************");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("************************************");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("************************************");
				int amount2 = scanner.nextInt();
				deposit(amount2);
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("************************************");
				getPreviousTrans();
				System.out.println("************************************");
				System.out.println("\n");
				break;
			case'E':
				System.out.println("******************************************");
				break;
				default:
					System.out.println("Invalid option!! Please try again.");
					break;
			}
		}while(option!= 'E');
		System.out.println("Thank you for using our services");
	}
	
}
