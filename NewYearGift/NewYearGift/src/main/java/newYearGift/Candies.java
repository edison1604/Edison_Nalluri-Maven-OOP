package newYearGift;
public class Candies extends Chocolate {
	Candies(int cost, int weight) {
		super(cost, weight);
	}
	public int getWeight() {
		return this.weight;
	}
	public int getCost() {
		return this.cost;
	}
}