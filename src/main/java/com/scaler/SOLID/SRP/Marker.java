package com.scaler.SOLID.SRP;

/*
===================SOLID==============================
S- Single responsibility principle
O- Open/Close principle
L- Liskov Substitution principle
I- Interface Segregation principle
D- Dependency inversion principle
==========================================================
============Advantages of SOLID===========================
1- Help us to write better code.
2- Avoid duplicate code.
3- Easy to maintain.
4- Easy to understand
5- Flexible Software
6- Reduces the complexity

Single responsibility principle says that a class should have only one reason to change.


 */
public class Marker {
	String name;
	String color;
	int year;
	int price;

	public Marker(String name, String color, int year, int price) {
		super();
		this.name = name;
		this.color = color;
		this.year = year;
		this.price = price;
	}

}

class InvoiceWithIssue {
	private Marker marker;
	private int quantity;

	public InvoiceWithIssue(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}

	public int calculateTotal() {
		int price = (marker.price) * this.quantity;
		return price;
	}

	public void printInvoice() {
		// print invoice
	}

	public void saveToDB() {
		// save invoice to database
	}
}

/*
 * Suppose we want to add GST and give discount of 20% on marker then we have to
 * go to the class and needs to update the calculateTotal method logic to handle
 * this requirement.
 * 
 * Same like that if we needs to update the invoice printing method of saveToDB
 * then again we have to change the code which is not correct.
 */

//=================================Solution========================
//In the below code each entity is doing its work, so suppose we need to modify price calculation logic then other methods will not get impacted.

class Invoice {
	Marker marker;
	int quantity;

	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
}

class PriceInvoice {
	private Invoice invoice;

	public PriceInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public int calculateTotal() {
		int price = (invoice.marker.price) * invoice.quantity;
		return price;
	}
}

class InvoiceDAo {
	private Invoice invoice;

	public InvoiceDAo(Invoice invoice) {
		this.invoice = invoice;
	}

	public void saveToDB() {
		// save to database
		System.out.println("Saving invoice to the database"+invoice);
	}
}

class PrintInvoice {
	private Invoice invoice;

	public PrintInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInvoice() {
		// print invoice
		System.out.println("Print Invoice"+invoice);
	}
}