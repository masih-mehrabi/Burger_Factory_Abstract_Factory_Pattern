package abstract_factory.burgerstore;

import abstract_factory.burger.BeefBurger;
import abstract_factory.burger.Burger;
import abstract_factory.burger.ChickenBurger;
import abstract_factory.burger.VeggieBurger;
import abstract_factory.ingredientsfactory.BurgerFactory;
import abstract_factory.ingredientsfactory.NYBurgerFactory;

public class NYBurgerStore extends BurgerStore {
    private final BurgerFactory ingredientFactory = new NYBurgerFactory();

    public Burger createBurger(String item) {
        return switch (item) {
            case "beef" -> new BeefBurger("New York Style Beef Burger", ingredientFactory);
            case "chicken" -> new ChickenBurger("New York Style Chicken Burger", ingredientFactory);
            case "veggie" -> new VeggieBurger("New York Style Veggie Burger", ingredientFactory);
            //TODO: handle "veggie" case
            default -> throw new IllegalArgumentException("Invalid burger item: " + item);
        };
    }

}
