
public class Beginning {

	public Beginning() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {

//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			
//		}
//		int counter = 0;
//		while(counter <= 100) {
//			System.out.println(counter);
//			counter = counter + 2;
//		}
		
//		
//		boolean val = 5 != 4;
//		System.out.println(val);
		
//		int numOfLegs = 4;
//		String name = "Cow";
//		String color = "White and Black";
//		boolean male = false;
//		int foodCount = 0;
//		boolean hungry = true;
		
		Cow cow1 = new Cow(4, "Sally", "White and Black", false, 0, true);
		Cow cow2 = new Cow(4, "Mathew", "Black", true, 10, false);

		System.out.println(cow2.foodCount);
		System.out.println(cow1.name);
		
		cow1.eat(123);
		System.out.println(cow1.foodCount);
		
	}

}
