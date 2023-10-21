import java.util.Scanner;

public class ATMMachine {
	Bank bank;
	Account cur;
	ATMMachine(String bankName){
		bank = new Bank(bankName);
		cur = new Account("You", "", 123456, 0);
		bank.accounts.put(123456, cur);
		panel();
		
	}
	
	public void panel() {
		Scanner in = new Scanner(System.in);
		
		int response=1;
		System.out.println("Enter ID (123456):");
		if(!bank.accounts.containsKey(in.nextInt())) {
			System.out.println("Sorry Account not found!");
			System.exit(0);
		}
		
		while(response != -1)
		{
			System.out.println("Would would you like to do?");
				
			System.out.println("1) Deposit");
			System.out.println("2) Withdraw");
			System.out.println("3) Show Balance");
			System.out.println("4) Transfer Money");
			System.out.println("5) Add Account");
			System.out.println("-1) Exit");
			response =in.nextInt();
			if(response ==1) {
				
				System.out.println("Enter amount to deposit:");
				cur.deposit(in.nextDouble());
				
			}
			else if(response ==2) {
				//System.out.println("Enter ID:");
				
				//cur = bank.accounts.get(in.nextInt());
				System.out.println("Enter amount to withdraw:");
				cur.withdraw(in.nextDouble());
			}
			else if(response ==3) {
				//System.out.println("Enter ID:");
								
				//cur = bank.accounts.get(in.nextInt());
				System.out.println("Your balance is: " + cur.getBalance());
	
			}
			else if(response ==4) {
				System.out.println("Enter the ID of the account you'd like to transfer: ");
				int id = in.nextInt();
				System.out.println("Enter the amount you would like to transfer: ");
				double amt = in.nextDouble();
				transfer(cur, bank.accounts.get(id), amt);
			}
			else if(response ==5) {
				addAccount();
			}
			
		}
		System.out.println("Thank you for connecting with us!");
		
		
	}
	public void addAccount() {
		Account acc = new Account();
		
		Scanner in = new Scanner(System.in);
		int response = in.nextInt();
		System.out.println("Welcome New Customer. To add a new account please give the following:");
		
		System.out.print("First Name: ");
		acc.setFirstName(in.next());
		System.out.println();
		
		System.out.print("Last Name: ");
		acc.setLastName(in.next());
		System.out.println();
		
		int bankingID = (int)(Math.random()*9999999);
		
		acc.setID(bankingID);
		
		System.out.println("Your Banking ID is: " + bankingID);
		System.out.println();
		
		System.out.print("How much would you like to deposit: ");
		
		acc.deposit(in.nextDouble());
		
		bank.accounts.put(acc.getId(), acc);
	}
	public void transfer(Account main, Account other, double amt) {
		main.withdraw(amt);
		other.deposit(amt);
	}
}
