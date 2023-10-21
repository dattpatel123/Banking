
public class Account {
	private String firstName;
	private String lastName;
	private int id;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
		firstName = "";
		lastName="";
		id=0;
		balance=0;
	}
	public Account(String first, String last, int iden, double bal)
	{
		firstName = first;
		lastName=last;
		id=iden;
		balance=bal;
		
	}
	
	public void deposit(double amt)
	{
		balance += amt;
		
		System.out.println(firstName + " " + lastName + "'s balance is: " + getBalance());
	}
	public void withdraw(double amt) {
		balance -= amt;
		
		System.out.println(firstName + " " + lastName + "'s balance is: " + getBalance());
		
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
	
	

}
