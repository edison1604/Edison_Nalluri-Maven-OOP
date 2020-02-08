package newYearGift;
public class Chocolate implements Gift{
	public int cost;
	public int weight;
	Chocolate(int cost, int weight) {
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