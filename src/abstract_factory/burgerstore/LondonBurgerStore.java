package abstract_factory.burgerstore;

import abstract_factory.burger.BeefBurger;
import abstract_factory.burger.Burger;
import abstract_factory.burger.ChickenBurger;
import abstract_factory.burger.VeggieBurger;
import abstract_factory.ingredientsfactory.BurgerFactory;
import abstract_factory.ingredientsfactory.LondonBurgerFactory;

public class LondonBurgerStore extends BurgerStore {
    
    private final BurgerFactory ingredientFactory = new LondonBurgerFactory();
    
    public Burger createBurger(String item) {
        //TODO: implement the burger creation process
        
        
        return switch (item) {
            case "beef" -> new BeefBurger("London Style Beef Burger", ingredientFactory);
            case "chicken" -> new ChickenBurger("London Style Chicken Burger", ingredientFactory);
            case "veggie" -> new VeggieBurger("London Style Veggie Burger", ingredientFactory);
            default -> throw new IllegalArgumentException("Invalid burger item: " + item);
        };
        
    }

}
