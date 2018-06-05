
public class Cow {
	
	//state variables
	
	int numOfLegs;
	String name;
	String color;
	boolean male;
	int foodCount;
	boolean hungry;

	/**
	 * Constructor that creates a cow object to be manipulated.
	 */
	public Cow(int numLegs, String someName, String someColor, boolean male, int foodCount, boolean hunger) {
		this.numOfLegs = numLegs;
		this.name = someName;
		this.color = someColor;
		this.male = male;
		this.foodCount = foodCount;
		this.hungry = hunger;
	}
	
	void eat(int amountToEat) {
		if (this.hungry) {
			this.foodCount = this.foodCount + amountToEat;
			this.hungry = false;
		}
	}

}
