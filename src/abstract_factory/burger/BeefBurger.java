package abstract_factory.burger;

import abstract_factory.ingredients.cheese.AmericanCheese;
import abstract_factory.ingredients.patty.Vegan;
import abstract_factory.ingredientsfactory.BurgerFactory;

public class BeefBurger extends Burger {

	public BeefBurger(String name, BurgerFactory ingredientFactory) {
		super(name, ingredientFactory);
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + this.getName());
        BurgerFactory ingredientFactory = getIngredientFactory();
		this.setBun(ingredientFactory.createBun());
		this.setSauce(ingredientFactory.createSauce());
		this.setVeggies(ingredientFactory.createVeggies());
		this.setPatty(new Vegan());
		this.setCheese(new AmericanCheese());
		//TODO: add cheese
	}
}

