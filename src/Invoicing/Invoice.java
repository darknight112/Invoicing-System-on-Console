package Invoicing;
import java.util.*;

public class Invoice {
	private int id;
	private int date;
	private float totalPaid;
	private float totalAmount;
	private float totalBalance;
	Scanner sr = new Scanner(System.in);

	public void createInvoice() {
		System.out.println("enter invoice id in integer ");
		this.id = sr.nextInt();
		System.out.println("enter invoice date ");
		this.date = sr.nextInt();
		

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public float getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(float totalPaid) {
		this.totalPaid = totalPaid;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public float getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(float totalBalance) {
		this.totalBalance = totalBalance;
	}
}
