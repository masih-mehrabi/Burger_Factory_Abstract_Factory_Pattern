package abstract_factory.ingredientsfactory;

import abstract_factory.ingredients.bun.SesameBun;
import abstract_factory.ingredients.cheese.Cheese;
import abstract_factory.ingredients.sauce.Ketchup;
import abstract_factory.ingredients.sauce.Sauce;
import abstract_factory.ingredients.veggie.Onion;
import abstract_factory.ingredients.veggie.Pickle;
import abstract_factory.ingredients.veggie.Tomato;
import abstract_factory.ingredients.veggie.Veggie;
import abstract_factory.ingredients.cheese.CheddarCheese;

import abstract_factory.ingredients.bun.Bun;

import java.util.List;

public class LondonBurgerFactory implements BurgerFactory {

	@Override
	public Bun createBun() {
		return new SesameBun();
	}

	@Override
	public Sauce createSauce() {
		return new Ketchup();
	}

	@Override
	public List<Veggie> createVeggies() {
		return List.of(new Onion(), new Tomato(), new Pickle());
	}
	
	@Override
	public Cheese createCheese() {
		return new CheddarCheese();
	}
}
