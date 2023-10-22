
public class Account {
	private String firstName;
	private String lastName;
	private int id;
	private double balance;
	private String password;
	
	public Account() {
		// TODO Auto-generated constructor stub
		firstName = "";
		lastName="";
		id=0;
		balance=0;
		password="";
	}
	public Account(String first, String last, int iden, double bal, String pass)
	{
		firstName = first;
		lastName=last;
		id=iden;
		balance=bal;
		password = pass;
		
	}
	
	public void deposit(double amt)
	{
		balance += amt;
		
		System.out.println(firstName + " " + lastName + "'s balance is: " + getBalance());
		System.out.println();
		
	}
	public void withdraw(double amt) {
		balance -= amt;
		
		System.out.println(firstName + " " + lastName + "'s balance is: " + getBalance());
		System.out.println();
	}
	
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	public void setPassword(String next) {
		// TODO Auto-generated method stub
		password = next;
		
	}
	
	

}
