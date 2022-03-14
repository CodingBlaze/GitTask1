import java.util.*;

class Flower {
	void isBeautiful() {
		System.out.println("Yes, it is beautiful");
	}
}

class TemperateFlower extends Flower {
	void hasSpikes() {
		System.out.println("Yes, these kind of flowers have thorns");
	}
}

class Rose extends TemperateFlower {
	String colour;

	Rose(String colour) {
		this.colour = colour;
	}

	int priceOfRose() {
		if (this.colour.equals("Black")) {
			return 10;
		} else if (this.colour.equals("Red")) {
			return 5;
		} else if (this.colour.equals("Yellow")) {
			return 7;
		} else if (this.colour.equals("Orange")) {
			return 6;
		} else {
			System.out.println("The colour of rose you specified is not present");
			return 0;
		}
	}

}

class Bouquet {
	int computePrice(List<Rose> b) {
		int price = 0;
		for (int i = 0; i < b.size(); i++) {
			price += b.get(i).priceOfRose();
		}
		return price;
	}
}

public class Hometask7 {

	public static void main(String[] args) {
		List<Rose> bouquet1 = new LinkedList<Rose>();
		Rose redRose = new Rose("Red");
		Rose blackRose = new Rose("Black");
		Rose yellowRose = new Rose("Yellow");
		Rose orangeRose = new Rose("Orange");
		bouquet1.add(redRose);
		bouquet1.add(orangeRose);
		bouquet1.add(yellowRose);
		bouquet1.add(blackRose);
		Bouquet bouquet = new Bouquet();
		int result = bouquet.computePrice(bouquet1);
		System.out.println("The cost of bouquet is " + result);
	}

}
