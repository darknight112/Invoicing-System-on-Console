package Invoicing;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.addItem();
		shop.printItems();
		shop.deleteItem();
		shop.printItems();
		

	}

}
