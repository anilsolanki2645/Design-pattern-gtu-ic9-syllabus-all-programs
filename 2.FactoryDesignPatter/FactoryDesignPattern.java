import java.util.Scanner;

abstract class Thali{
	abstract String addSabji();
	abstract String addDal();
	abstract String addRice();
	abstract String addRoti();
	void makeThali(){
		System.out.print("vagitable thali will be ready in 30 minuts");
		
	}
}

class GujratiThali extends Thali{
	String addSabji(){
		return "sabji";
	}	
	String addDal(){
		return "Dal";
	}
	String addRice(){
		return "rice";
	}
	String addRoti(){
		return "roti";
	}
	//String makeThali(){	
	//}
}

class PunjabiThali extends Thali{
	String addSabji(){
		return "sabji";
	}	
	String addDal(){
		return "Dal";
	}
	String addRice(){
		return "rice";
	}
	String addRoti(){
		return "roti";
	}
	
	//String makeThali(){};
}

abstract class BaseThaliRetaurent{
	abstract Thali createThali(String type);
}

class ThaliRestaurent extends BaseThaliRetaurent{
	 Thali createThali(String type){
			int ch=0;
		
			if(type.equalsIgnoreCase("gujarati")){
				ch=1;
			}
			
			if(type.equalsIgnoreCase("punjabi")){
				ch=2;
			}
			
		switch(ch){
			case 1:
				return new GujratiThali();
			
			case 2:
				return new PunjabiThali();
			
			default:break;
		}
		return null;
	}
}

class FactoryDesignPattern{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("1: gujarati \n2: punjabi ");
		String typ = s.nextLine();
		ThaliRestaurent tr = new ThaliRestaurent();
		Thali thali = tr.createThali(typ);
		System.out.println(thali.addSabji());
		System.out.println(thali.addDal());
		System.out.println(thali.addRice());
		System.out.println(thali.addRoti());
		thali.makeThali();
	}
}