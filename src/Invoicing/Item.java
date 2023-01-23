package Invoicing;
import java.util.*;
public class Item {
	private int id;
	private float price;
	private String name;
	Scanner sr = new Scanner(System.in);
	
//	public void addItem() {
//		System.out.println("enter item id in integer ");
//		id=sr.nextInt();
//		System.out.println("enter item price ");
//		price=sr.nextInt();
//		System.out.println("enter item name ");
//		String inputS=sr.next();
//		name=inputS;
//		System.out.println("Item created ... ");
//
//	}
//	
//	public void changePrice(int id) {
//		System.out.println("enter item price ");
//		id=sr.nextInt();
//		System.out.println("enter item price ");
//		price=sr.nextInt();
//		System.out.println("enter item name ");
//		String inputS=sr.next();
//		name=inputS;
//		System.out.println("Item created ... ");
//
//	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Scanner getSr() {
		return sr;
	}

	public void setSr(Scanner sr) {
		this.sr = sr;
	}
	
	



	
	

}
