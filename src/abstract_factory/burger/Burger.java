package abstract_factory.burger;

import abstract_factory.ingredients.cheese.Cheese;
import abstract_factory.ingredients.patty.Patty;
import abstract_factory.ingredients.sauce.Sauce;
import abstract_factory.ingredients.veggie.Veggie;
import abstract_factory.ingredients.bun.Bun;
import abstract_factory.ingredientsfactory.BurgerFactory;

import java.util.List;

public abstract class Burger {

	private final String name;
	private Bun bun;
	private Sauce sauce;
	private List<Veggie> veggies;
	private Patty patty;
    private BurgerFactory ingredientFactory;
	
	private Cheese cheese;

	//TODO: Extend the Burger class for the cheese

	//TODO: getters and setters

	protected Burger(String name, BurgerFactory ingredientFactory) {
		this.name = name;
        this.ingredientFactory = ingredientFactory;
	}

	public String getName() {
		return name;
	}

	public Bun getBun() {
		return bun;
	}

	public Patty getPatty() {
		return patty;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public List<Veggie> getVeggies() {
		return veggies;
	}

    BurgerFactory getIngredientFactory() {
        return ingredientFactory;
    }

	void setBun(Bun bun) {
		this.bun = bun;
	}

	void setPatty(Patty patty) {
		this.patty = patty;
	}

	void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	void setVeggies(List<Veggie> veggies) {
		this.veggies = veggies;
	}

	public abstract void prepare();

	public void cook() {
		System.out.println("Cook patty for 3-4 minutes on both sides");
	}

	public void build() {
		System.out.println("Build a burger");
	}

	public void box() {
		System.out.println("Place burger in official BurgerStore box");
	}

	@Override
	public String toString() {
		//TODO extend the toString method with cheese
		return "Burger{"
				+ "name='" + name + '\''
				+ ", bun=" + bun
				+ ", sauce=" + sauce
				+ ", veggies=" + veggies
				+ ", patty=" + patty
				+	", cheese=" + cheese
				+ '}';
	}
	
	
	public Cheese getCheese() {
		return cheese;
	}
	

	void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
}
