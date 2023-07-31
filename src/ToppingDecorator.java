
public class ToppingDecorator implements Pizza {

         protected Pizza pizza;

	// Assigns the type instance to this attribute of a Pizza	
	// All decorators can dynamically customize the Pizza
	// instance PlainPizza because of this

	public ToppingDecorator(Pizza newPizza){
                     pizza=newPizza;
	}
	
	public String getDescription() {

		return pizza.getDescription();
	}


	public double getCost() {

		return pizza.getCost();
	}

	
	

}


