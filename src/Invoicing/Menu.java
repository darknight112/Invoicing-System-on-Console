package Invoicing;

import java.util.*;

public class Menu {
	ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
	Scanner sr = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("==== System Main Menu ====");
		
		Menu menu = new Menu();
		menu.createInvoice();
	}
	
	public void mainMenu() {
		boolean condition=true;
		
		while(condition) {
			System.out.println("1-Shop Settings");
			System.out.println("2- Manage Shop Items");
			System.out.println("3- Create New Invoice");
			System.out.println("4- Report: Statistics (No Of Items, No of Invoices, Total Sales)");
			System.out.println("5- Print All Invoices");
			System.out.println("6- Search Invoice (Search by Invoice No and Report All Invoice details with items)");
			System.out.println("7- Program Statistics (Print each Main Menu Item with how many number selected)");
			System.out.println("8- Exit");
			int input=sr.nextInt();
			switch(input) {
				case 1:
					System.out.println("1. Load Data (Items and invoices)");
					System.out.println("2. Set Shop Name");
					System.out.println("3. Set Invoice Header (Tel / Fax / Email / Website)");
					System.out.println("4. Go Back");
					switch(sr.nextInt()) {
						case 1:
							printInvoice();
							break;
						case 2:
							
							}
					}
			}

			
		}
	
	
	public void printInvoice() {
		System.out.println("=== Inoivce List ===");
		for(Invoice element:invoiceList) {
			System.out.println("Invoice ID " + element.getId() + " Invoice Date " +element.getDate() );
			System.out.println("Shop ID " + element.s.getId() + " Shop Name " +element.s.getName() );
			//System.out.println("Customer ID " element.c.getId());

			
		}
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
				//invoice.c = invoice.s.customer.get(sr.nextInt());
				

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
					invoiceList.add(invoice);

				}
			}

	}
}
