package com.scaler.dp.proxy;

public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public void create(String client, Employee e) throws Exception {
		System.out.println("Created new row in the database");

	}

	@Override
	public void delete(String client, int empId) throws Exception {
		System.out.println("Delete row wit employee id:"+empId);

	}

	@Override
	public Employee get(String client, int empId) throws Exception {
		System.out.println("Fetching the record from databse");
		return new Employee();
	}

}
