package newYearGift;

import java.util.*;

public class Calculate {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Sweets> sweets = new ArrayList<Sweets>();	
	static ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>();
	static HashMap<String, Integer> costs = new HashMap<String, Integer>();
	static HashMap<String, Integer> weights = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		System.out.print("Input chocolates count: ");
		int Count = input.nextInt();
		for(int i = 0; i < Count; i++) {
			System.out.print("choose type (Enter number) 1.candies \n 2.Darkchocies: ");
			int Type = input.nextInt();
			System.out.print("\nName= ");
			String n = input.next();
			System.out.print("\nCost= ");
			int cost = input.nextInt();
			System.out.print("\nWeight= ");
			int weight = input.nextInt();
			Chocolate c;
			if(Type == 1) c = new Candies(cost, weight);
			else c = new Darkchock(cost, weight);
			chocolates.add(c);
			
			if(costs.containsKey(n)) {
				costs.put(n, (int)costs.get(n) + cost);
			}
			else {
				costs.put(n, cost);
			}
			if(weights.containsKey(n)) {
				weights.put(n, (int)weights.get(n) + weight);
			}
			else {
				weights.put(n, weight);
			}
		}
		System.out.print("Input sweets count: ");
		Count = input.nextInt();
		for(int i = 0; i < Count; i++) {
			System.out.print("choose type (Enter number) 1.Badamsweet \n 2.laddoo: ");
			int Type = input.nextInt();
			System.out.print("\nName= ");
			String n = input.next();
			System.out.print("\nCost= ");
			int cost = input.nextInt();
			System.out.print("\nWeight= ");
			int weight = input.nextInt();
			Sweets s;
			if(Type == 1) s = new Badamsweet(cost, weight);
			else s = new laddo(cost, weight);
			sweets.add(s);
			
			if(costs.containsKey(n)) {
				costs.put(n, (int)costs.get(n) + cost);
			}
			else {
				costs.put(n, cost);
			}
			if(weights.containsKey(n)) {
				weights.put(n, (int)weights.get(n) + weight);
			}
			else {
				weights.put(n, weight);
			}
		}
		int TW = 0; //Total weight
		for(Sweets i:sweets) TW+=i.getWeight();
		for(Chocolate j:chocolates) TW += j.getWeight();
		System.out.println("The total weight is:= "+TW);
	
	   	int TP = 0; //Total price
	   	for(Sweets i:sweets) TP+=i.getCost();
		for(Chocolate j:chocolates) TP += j.getCost();
		System.out.println("The total cost is:= "+TP);
}}