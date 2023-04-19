package abstract_factory;

import abstract_factory.burger.Burger;
import abstract_factory.burgerstore.NYBurgerStore;
import abstract_factory.burgerstore.BurgerStore;
import abstract_factory.burgerstore.LondonBurgerStore;

final class Main {

	private Main() {
	}

	public static void main(String[] args) {

		
		BurgerStore nyStore = new NYBurgerStore();
		BurgerStore londonStore = new LondonBurgerStore();

		Burger burger = nyStore.orderBurger("veggie");
		System.out.println("Ethan ordered a " + burger);

		burger = londonStore.orderBurger("veggie");
		System.out.println("Ethan ordered a " + burger);
		System.out.println("Joel ordered a " + burger);

		burger = nyStore.orderBurger("beef");
		System.out.println("Ethan ordered a " + burger);

		burger = londonStore.orderBurger("beef");
		System.out.println("Joel ordered a " + burger);

		burger = nyStore.orderBurger("chicken");
		System.out.println("Ethan ordered a " + burger);

		burger = londonStore.orderBurger("chicken");
		System.out.println("Joel ordered a " + burger);
		
	}

}
