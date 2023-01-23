package Invoicing;

import java.util.*;

public class Menu {
	ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
	Scanner sr = new Scanner(System.in);

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.createInvoice();
	}

	public void createInvoice() {
		Invoice invoice = new Invoice();
		invoice.setId(invoiceList.size());
		System.out.println("Enter the date ");
		invoice.setDate(sr.nextInt());
		invoice.s.addCustomer();
		invoice.s.addItem();
		boolean condition = true;
		while (condition) {
			System.out.println("1 Enter the ID of customer who purchase/ 2 to show the customer / 3 add new customer / 4 exit ");
			System.out.println("2 to show the customer");
			System.out.println("3 add new customer");
			System.out.println(" 4 exit ");
			int input = sr.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter the ID of customer who purchase ");
				Customer c = new Customer();
				c = invoice.s.customer.get(sr.nextInt());

				break;
			case 2:
				invoice.s.printCustomers();
				break;
			case 3:
				invoice.s.addCustomer();
				break;
			case 4:
				condition = false;
				System.out.println("exit");
				break;
			}

				System.out.println("1 Enter the ID of item you want to purchase ");
				System.out.println("press 2 to show the items ");
				System.out.println("press 3 to exit ");

				if (input == 2) {
					invoice.s.printItems();
				}

				else if (input == 3) {
					condition = false;
					System.out.println("exit");
				} else {
					System.out.println("Enter the ID of item you want to purchase / 99 to exit ");
					input = sr.nextInt();
					if (input == 99) {
						condition = false;
						System.out.println("exit");
					}
					Item i = new Item();
					System.out.println("Enter the ID of item ");
					i = invoice.s.item.get(sr.nextInt());
					invoice.purchase.add(i);
					System.out.println("Enter the paid amount ");
					input = sr.nextInt(); 
					invoice.total(input);

				}
			}

	}
}
