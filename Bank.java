import java.util.*;

class Bankdep
{

	
	public void deposit(String name,float curbal)
	{

	System.out.println("Account Holder Name is ..." + name);
	
	System.out.println("Account Holder current Balance is ..." + curbal);	

	Scanner sc = new Scanner(System.in);

	float depbal = sc.nextFloat();

	float totbal = depbal + curbal;

	System.out.println("Account Holder Total Balance is ..." + totbal);
		

	}	
	
}

class Bank
{

	public static void main(String args[])
	{

	Bankdep bd = new Bankdep();
	bd.deposit("Anil",5000);

	}
}
