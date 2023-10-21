import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
		
	
	HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	String name;
	
	public Bank(String name)
		
	{
		this.name=name;	
		System.out.println("Welcome to " + name);
	}
	
}
