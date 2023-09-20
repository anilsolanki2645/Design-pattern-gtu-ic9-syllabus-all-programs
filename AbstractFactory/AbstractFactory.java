import java.io.*;
import java.util.*;

interface Bank{
	String getBankName();
}

class HDFC implements Bank{
	private final String bname;
	public HDFC(){
		bname = "HDFC bank";
	}
	public String getBankName(){
		return bname;
	}
}

class ICICI implements Bank{
	private final String bname;
	public ICICI(){
		bname = "ICICI bank";
	}
	public String getBankName(){
		return bname;
	}
}

class SBI implements Bank{
	private final String bname;
	public SBI(){
		bname = "SBI bank";
	}
	public String getBankName(){
		return bname;
	}
}

abstract class Loan{
	double rate;
	abstract void getInterestRate(double rate);
	public void calculateLoanPayment(double loanamount, int time){
		double EMI;
		int n;
		n = time * 12;
		rate = rate/1200;
		EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;
		System.out.print("your EMI is "+EMI+"and is "+loanamount+"you have borrowed");
	}
}

class HomeLoan extends Loan{
	void getInterestRate(double r){
		rate = r;
	}
}

class BuisnessLoan extends Loan{
	void getInterestRate(double r){
		rate = r;
	}
}

class EducationLoan extends Loan{
	void getInterestRate(double r){
		rate = r;
	}
}

abstract class Abstract_Factory{
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
}

class BankFactory extends Abstract_Factory{
	public Bank getBank(String bank){
		if(bank.equalsIgnoreCase("HDFC")){
			return new HDFC();
		}
		if(bank.equalsIgnoreCase("ICICI")){
			return new ICICI();
		}
		if(bank.equalsIgnoreCase("SBI")){
			return new SBI();
		}
return null;
	}
public Loan getLoan(String loan)
{
return null;
}
} 

class LoanFactory extends Abstract_Factory{
	public Loan getLoan(String loan){
		if(loan.equalsIgnoreCase("Business"))
			{
				return new BuisnessLoan();
			}
		if(loan.equalsIgnoreCase("Home")){
			return new HomeLoan();
		}
		if(loan.equalsIgnoreCase("Education")){
			return new EducationLoan();
		}
return null;
	}
public Bank getBank(String bank){
return null;
}
}

class FactoryCreator{
	public static Abstract_Factory getFactory(String choice){
		if(choice.equalsIgnoreCase("Bank")){
			return new BankFactory();
		}
		else if(choice.equalsIgnoreCase("Loan")){
			return new LoanFactory();
		}
		else{
			return null;
		}
	}
}


//Main method
public class AbstractFactory{
	public static void main(String args[]) throws IOException,NullPointerException{
		Scanner s = new Scanner(System.in);
		 
		 //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name of Bank from where you want to take loan amount:");
		String bankName = s.nextLine();
		
		System.out.print("\n");
		System.out.println("Enter the type of loan e.g. home loan or business loan or education loan : ");
		String loanName = s.nextLine();
		
		Abstract_Factory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);
		
		System.out.println();
		System.out.println("Enter the interest for"+b.getBankName()+" : ");
		
		double rate = Double.parseDouble(s.next());
		
		System.out.println();
		
		System.out.print("Enter the loan amount you want to take: ");  
		double loanAmount = Double.parseDouble(s.next());
		System.out.println();
		
		System.out.println("Enter the number of years to pay your entire loan amount : ");
		int years = Integer.parseInt(s.next());
		System.out.println();
		
		System.out.print("you are taking the loan from "+b.getBankName());
		
		Abstract_Factory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount,years);
	}
}

