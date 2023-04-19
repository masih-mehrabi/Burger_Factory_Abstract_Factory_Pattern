package abstract_factory.ingredientsfactory;

import abstract_factory.ingredients.bun.Brioche;
import abstract_factory.ingredients.cheese.Cheese;
import abstract_factory.ingredients.sauce.Barbecue;
import abstract_factory.ingredients.sauce.Sauce;
import abstract_factory.ingredients.veggie.*;
import abstract_factory.ingredients.cheese.AmericanCheese;
import abstract_factory.ingredients.bun.Bun;

import java.util.List;

public class NYBurgerFactory implements BurgerFactory {

	@Override
	public Bun createBun() {
		return new Brioche();
	}

	@Override
	public Sauce createSauce() {
		return new Barbecue();
	}

	@Override
	public List<Veggie> createVeggies() {
		return List.of(new Tomato(), new Lettuce(), new Pickle(), new Onion());
	}
	
	@Override
	public Cheese createCheese() {
		return new AmericanCheese();
	}
}
