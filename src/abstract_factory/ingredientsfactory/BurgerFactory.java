package abstract_factory.ingredientsfactory;

import abstract_factory.ingredients.cheese.Cheese;
import abstract_factory.ingredients.sauce.Sauce;
import abstract_factory.ingredients.veggie.Veggie;
import abstract_factory.ingredients.bun.Bun;

import java.util.List;

public interface BurgerFactory {

	Bun createBun();

	Sauce createSauce();

	List<Veggie> createVeggies();
	Cheese createCheese();

}
