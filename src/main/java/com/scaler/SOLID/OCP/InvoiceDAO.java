package com.scaler.SOLID.OCP;

/*
Open/Close principle says that application/code should be open for extension but close for modification.

 */
class Marker {
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

class Invoice {
	Marker marker;
	int quantity;

	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
}

class InvoiceDAO {
	private Invoice invoice;

	public InvoiceDAO(Invoice invoice) {
		this.invoice = invoice;
	}

	public void saveToDB() {
		// save to database
		System.out.println("Saving invoice to the database" + invoice);
	}
}

//Now if we got the requirement to add method to save into file or mongoDB etc . then we have to do modification in the code as below:
class InvoiceDAO1 {
	private Invoice invoice;

	public InvoiceDAO1(Invoice invoice) {
		this.invoice = invoice;
	}

	public void saveToDB() {
		// save to database
		System.out.println("Saving invoice to the database" + invoice);
	}

	public void saveToFile() {
		// save to database
		System.out.println("Saving invoice to the database" + invoice);
	}
}

//But here its breaking the principle of open/close.
//The code is already tested and running in the production and you are doing changes in that code which is wrong because we have to test whole application again
//there could be a chance of bug introduces in the working code.
//So suppose in future there is a new requirement to save file in MySql then simply create a class that implements InvoiceDAO interface.

//==================================Solution of above issue===========================

interface InvoiceDAOInterface {
	void save(Invoice invoice);
}

class OracleInvoiceDAO implements InvoiceDAOInterface {

	@Override
	public void save(Invoice invoice) {
		System.out.println("Saving to the Oracle database");

	}
}

class MongoDBInvoiceDAO implements InvoiceDAOInterface {

	@Override
	public void save(Invoice invoice) {
		System.out.println("Saving to the MongoDB database");

	}
}

class FileInvoiceDAO implements InvoiceDAOInterface {

	@Override
	public void save(Invoice invoice) {
		System.out.println("Saving to the File");

	}
}


