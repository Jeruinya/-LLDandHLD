package com.scaler.dp.proxy;

public class ProxyDesignPattern {

	public static void main(String[] args) {
		try {
			EmployeeDAO d = new EmployeeDaoProxy();
			d.create("ADMIN", new Employee());
			System.out.println("Operation Successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
