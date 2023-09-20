import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Item{
	public String name();
	public String size();
	public float price();
}

abstract class Pizza implements Item{
	public abstract float price();
}

abstract class ColdDrink implements Item{
	public abstract float price();
}

abstract class VegPizza extends Pizza{
	public abstract String name();
	public abstract String size();
	public abstract float price();
}


abstract class NonVegPizza extends Pizza{
	public abstract String name();
	public abstract String size();
	public abstract float price();
}

//for veg pizza
//for cheeze pizza
class SmallCheezePizza extends VegPizza{
	public String name(){
		return "Cheeze pizza";
	}
	public String size(){
		return "small size";
	}
	public float price(){
		return 170.0f;
	}
}

class MediumCheezePizza extends VegPizza{
	public String name(){
		return "Cheeze pizza";
	}
	public String size(){
		return "medium size";
	}
	public float price(){
		return 200.0f;
	}
}

class LargeCheezePizza extends VegPizza{
	public String name(){
		return "Cheeze pizza";
	}
	public String size(){
		return "large size";
	}
	public float price(){
		return 250.0f;
	}
}

class ExtraLargeCheezePizza extends VegPizza{
	public String name(){
		return "Cheeze pizza";
	}
	public String size(){
		return "Extralarge size";
	}
	public float price(){
		return 320.0f;
	}
}

//for onion pizza

class SmallOnionPizza extends VegPizza{
	public String name(){
		return "Onion pizza";
	}
	public String size(){
		return "small size";
	}
	public float price(){
		return 170.0f;
	}
}

class MediumOnionPizza extends VegPizza{
	public String name(){
		return "Onion pizza";
	}
	public String size(){
		return "medium size";
	}
	public float price(){
		return 200.0f;
	}
}

class LargeOnionPizza extends VegPizza{
	public String name(){
		return "Onion pizza";
	}
	public String size(){
		return "large size";
	}
	public float price(){
		return 250.0f;
	}
}

class ExtraLargeOnionPizza extends VegPizza{
	public String name(){
		return "Onion pizza";
	}
	public String size(){
		return "Extralarge size";
	}
	public float price(){
		return 320.0f;
	}
}

//for Masala pizza

class SmallMasalaPizza extends VegPizza{
	public String name(){
		return "Masala pizza";
	}
	public String size(){
		return "small size";
	}
	public float price(){
		return 170.0f;
	}
}

class MediumMasalaPizza extends VegPizza{
	public String name(){
		return "Masala pizza";
	}
	public String size(){
		return "medium size";
	}
	public float price(){
		return 200.0f;
	}
}

class LargeMasalaPizza extends VegPizza{
	public String name(){
		return "Masala pizza";
	}
	public String size(){
		return "large size";
	}
	public float price(){
		return 250.0f;
	}
}

class ExtraLargeMasalaPizza extends VegPizza{
	public String name(){
		return "Masala pizza";
	}
	public String size(){
		return "Extralarge size";
	}
	public float price(){
		return 320.0f;
	}
}

//for NonVeg pizza
class SmallNonVegPizza extends VegPizza{
	public String name(){
		return "NonVeg pizza";
	}
	public String size(){
		return "small size";
	}
	public float price(){
		return 170.0f;
	}
}

class MediumNonVegPizza extends VegPizza{
	public String name(){
		return "NonVeg pizza";
	}
	public String size(){
		return "medium size";
	}
	public float price(){
		return 200.0f;
	}
}

class LargeNonVegPizza extends VegPizza{
	public String name(){
		return "NonVeg pizza";
	}
	public String size(){
		return "large size";
	}
	public float price(){
		return 250.0f;
	}
}

class ExtraLargeNonVegPizza extends VegPizza{
	public String name(){
		return "NonVeg pizza";
	}
	public String size(){
		return "Extralarge size";
	}
	public float price(){
		return 320.0f;
	}
}


//for coldDrink
abstract class Pepsi extends ColdDrink{
	public abstract String name();
	public abstract String size();
	public abstract float price();
}

abstract class Coke extends ColdDrink{
	public abstract String name();
	public abstract String size();
	public abstract float price();
}

// for pepsi
class SmallPepsi extends Pepsi{
	public String name(){
		return "300ml Pepsi";
	}
	public String size(){
		return "Small Size";
	}
	public float price(){
		return 25.0f;
	}
}

class MediumPepsi extends Pepsi{
	public String name(){
		return "350ml Pepsi";
	}
	public String size(){
		return "Medium Size";
	}
	public float price(){
		return 30.0f;
	}
}

class LargePepsi extends Pepsi{
	public String name(){
		return "450ml Pepsi";
	}
	public String size(){
		return "Large Size";
	}
	public float price(){
		return 45.0f;
	}
}


// for Coke
class SmallCoke extends Coke{
	public String name(){
		return "300ml Coke";
	}
	public String size(){
		return "Small Size";
	}
	public float price(){
		return 25.0f;
	}
}

class MediumCoke extends Coke{
	public String name(){
		return "350ml Coke";
	}
	public String size(){
		return "Medium Size";
	}
	public float price(){
		return 30.0f;
	}
}

class LargeCoke extends Coke{
	public String name(){
		return "450ml Coke";
	}
	public String size(){
		return "Large Size";
	}
	public float price(){
		return 50.0f;
	}
}


//for ordered Items
class OrderedItems{
	List<Item> items = new ArrayList<Item>();
	
	public void addItems(Item item){
		items.add(item);
	}
	public float getCost(){
		float cost = 0.0f;
		for(Item item : items){
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems(){
		for(Item item : items){
			System.out.println("Item is : "+item.name());
			System.out.println("Size is : "+item.size());
			System.out.println("Price is : "+item.price());
		}
	}
}

//for ordered BuilderPattern

class OrderedBuilder{
	public OrderedItems preparePizza() throws IOException{
		OrderedItems itemsOrder = new OrderedItems();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\t Enter choice of pizza");
		System.out.println("\t -----------------------------");
		System.out.println("\t 1.veg pizza");
		System.out.println("\t 2.non veg pizza");
		System.out.println("\t 3.exit");
		System.out.println("\t -----------------------------");
		
		int pizzacolddrinkchoice = Integer.parseInt(br.readLine());
		switch(pizzacolddrinkchoice){
			case 1:{
				System.out.println("\t You ordered Veg Pizza");
				System.out.println("\t Enter Type Of Pizza");
				System.out.println("\t -----------------------------");
				System.out.println("\t 1.cheeze pizza");
				System.out.println("\t 2.onion pizza");
				System.out.println("\t 3.masala pizza");
				System.out.println("\t 4.exit");
				System.out.println("\t -----------------------------");
				int vegpizzachoice = Integer.parseInt(br.readLine());
				switch(vegpizzachoice){
					case 1:{
						System.out.println("\t You Ordered Cheeze Pizza");
						System.out.println("\t Enter the size of cheeze pizza");
						System.out.println("\t -----------------------------");
						System.out.println("\t 1.small cheeze pizza");
						System.out.println("\t 2.medium cheeze pizza");
						System.out.println("\t 3.large cheeze pizza");
						System.out.println("\t 4.extra large cheeze pizza");
						System.out.println("\t -----------------------------");
						int cheezepizzasize = Integer.parseInt(br.readLine());
						switch(cheezepizzasize){
							case 1:
								itemsOrder.addItems(new SmallCheezePizza());
								break;
							case 2:
								itemsOrder.addItems(new MediumCheezePizza());
								break;
							case 3:
								itemsOrder.addItems(new LargeCheezePizza());
								break;
							case 4:
								itemsOrder.addItems(new ExtraLargeCheezePizza());
								break;
						}
					}break;
					case 2:{
						System.out.println("\t You Ordered Onion Pizza");
						System.out.println("\t Enter the size of Onion pizza");
						System.out.println("\t -----------------------------");
						System.out.println("\t 1.small Onion pizza");
						System.out.println("\t 2.medium Onion pizza");
						System.out.println("\t 3.large Onion pizza");
						System.out.println("\t 4.extra large Onion pizza");
						System.out.println("\t -----------------------------");
						int onionpizzasize = Integer.parseInt(br.readLine());
						switch(onionpizzasize){
							case 1:
								itemsOrder.addItems(new SmallOnionPizza());
								break;
							case 2:
								itemsOrder.addItems(new MediumOnionPizza());
								break;
							case 3:
								itemsOrder.addItems(new LargeOnionPizza());
								break;
							case 4:
								itemsOrder.addItems(new ExtraLargeOnionPizza());
								break;
						}
					}break;
					case 3:{
						System.out.println("\t You Ordered masala Pizza");
						System.out.println("\t Enter the size of masala pizza");
						System.out.println("\t -----------------------------");
						System.out.println("\t 1.small masala pizza");
						System.out.println("\t 2.medium masala pizza");
						System.out.println("\t 3.large masala pizza");
						System.out.println("\t 4.extra large masala pizza");
						System.out.println("\t -----------------------------");
						int masalapizzasize = Integer.parseInt(br.readLine());
						switch(masalapizzasize){
							case 1:
								itemsOrder.addItems(new SmallMasalaPizza());
								break;
							case 2:
								itemsOrder.addItems(new MediumMasalaPizza());
								break;
							case 3:
								itemsOrder.addItems(new LargeMasalaPizza());
								break;
							case 4:
								itemsOrder.addItems(new ExtraLargeMasalaPizza());
								break;
						}
						
					}break;
				}
			}break;				
			case 2:{
				System.out.println("\t You Ordered NonVeg Pizza");
				System.out.println("\t -----------------------------");
				System.out.println("\t Enter The NonVeg Pizza Size");
				System.out.println("\t 1.Small NonVeg Pizza");
				System.out.println("\t 2.Medium NonVeg Pizza");
				System.out.println("\t 3.Large NonVeg Pizza");
				System.out.println("\t 4.ExtraLarge NonVeg Pizza");
				System.out.println("\t -----------------------------");
				int nonvegpizzasize = Integer.parseInt(br.readLine());
				switch(nonvegpizzasize){
					case 1:
						itemsOrder.addItems(new SmallNonVegPizza());
						break;
					case 2:
						itemsOrder.addItems(new MediumNonVegPizza());
						break;
					case 3:
						itemsOrder.addItems(new LargeNonVegPizza());
						break;
					case 4:
						itemsOrder.addItems(new ExtraLargeNonVegPizza());
						break;
				}
			}
			break;
			default:{break;}
		}	//end of pizza switch
		
		// cold drink choice start
		System.out.println("\t Enter the choice of colddrink");
		System.out.println("\t -----------------------------");
		System.out.println("\t 1.pepsi");
		System.out.println("\t 2.coke");
		System.out.println("\t 3.exit");
		System.out.println("\t -----------------------------");
		int coldDrink = Integer.parseInt(br.readLine());
		switch(coldDrink){
			case 1:{
				System.out.println("\t You Ordered Pepsi");
				System.out.println("\t Enter The Pepsi Size");
				System.out.println("\t -----------------------------");
				System.out.println("\t 1.small pespi");
				System.out.println("\t 2.medium pepsi");
				System.out.println("\t 3.large pepsi");
				System.out.println("\t -----------------------------");
				int pepsisize = Integer.parseInt(br.readLine());
				switch(pepsisize){
					case 1:
						itemsOrder.addItems(new SmallPepsi());
						break;
					case 2:
						itemsOrder.addItems(new MediumPepsi());
						break;
					case 3:
						itemsOrder.addItems(new LargePepsi());
						break;
				}
			}break;
			case 2:{
				System.out.println("\t You Ordered coke");
				System.out.println("\t Enter The coke Size");
				System.out.println("\t -----------------------------");
				System.out.println("\t 1.small coke");
				System.out.println("\t 2.medium coke");
				System.out.println("\t 3.large coke");
				System.out.println("\t -----------------------------");
				int cokesize = Integer.parseInt(br.readLine());
				switch(cokesize){
					case 1:
						itemsOrder.addItems(new SmallCoke());
						break;
					case 2:
						itemsOrder.addItems(new MediumCoke());
						break;
					case 3:
						itemsOrder.addItems(new LargeCoke());
						break;
				}
			}break;
			default:{break;}
		}//end of colddrink switch case
		return itemsOrder;
	}
}

public class BuilderDemo{
	public static void main(String[] args) throws IOException{
		OrderedBuilder builder = new OrderedBuilder();
		
		OrderedItems ordereditems = builder.preparePizza();
		
		ordereditems.showItems();
		
		System.out.println("\n***** Total Cost : "+ordereditems.getCost());
	}
}

