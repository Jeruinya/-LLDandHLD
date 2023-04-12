package com.scaler.SOLID.ISP;

/*
Interfaces should be defined in such a way that client  should not implement unnecessary functions that they don't need.

Here Client Waiter is implementing unnecessary methods so violating  the interface segregation principle
 */
public interface RestaurantEmployee {
	void washDishes();

	void serveCustomers();

	void cookFood();

}

class Waiter implements RestaurantEmployee {

	@Override
	public void washDishes() {
		// Not my job

	}

	@Override
	public void serveCustomers() {
		// Yes this is my job so service the customers

	}

	@Override
	public void cookFood() {
		// Not my job

	}

}
//============================================Solution of Above issue========================

interface WaiterInterface {
	void serveCustomer();

	void takeOrder();
}

interface ChefInterface {
	void cookFood();

	void decideMenu();
}

class WaiterImpl implements WaiterInterface {

	@Override
	public void serveCustomer() {
		System.out.println("Service Customer");

	}

	@Override
	public void takeOrder() {
		System.out.println("Taking Order");

	}

}