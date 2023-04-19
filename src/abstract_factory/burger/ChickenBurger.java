package abstract_factory.burger;

import abstract_factory.ingredients.patty.Chicken;
import abstract_factory.ingredientsfactory.BurgerFactory;
import abstract_factory.ingredients.cheese.CheddarCheese;

public class ChickenBurger extends Burger {

	public ChickenBurger(String name, BurgerFactory ingredientFactory) {
		super(name, ingredientFactory);
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + this.getName());
        BurgerFactory ingredientFactory = getIngredientFactory();
		this.setBun(ingredientFactory.createBun());
		this.setSauce(ingredientFactory.createSauce());
		this.setVeggies(ingredientFactory.createVeggies());
		this.setPatty(new Chicken());
		this.setCheese(new CheddarCheese());
		//TODO: add cheese
	}
	

	
	
}
