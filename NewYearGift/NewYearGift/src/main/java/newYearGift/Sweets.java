package newYearGift;
public class Sweets implements Gift {
	public int cost;
	public int weight;
	Sweets(int cost, int weight) {
		this.cost = cost;
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}
	public int getCost() {
		return this.cost;
	}
}