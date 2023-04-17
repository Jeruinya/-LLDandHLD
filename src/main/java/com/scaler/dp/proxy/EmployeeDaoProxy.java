package com.scaler.dp.proxy;

public class EmployeeDaoProxy implements EmployeeDAO {
	EmployeeDAO emp;

	EmployeeDaoProxy() {
		emp = new EmployeeDaoImpl();
	}

	@Override
	public void create(String client, Employee e) throws Exception {
		if (client.equals("ADMIN")) {
			emp.create(client, e);
			return;
		}
		throw new Exception("Access Denied");

	}

	@Override
	public void delete(String client, int empId) throws Exception {
		if (client.equals("ADMIN")) {
			emp.delete(client, empId);
			return;
		}
		throw new Exception("Access Denied");

	}

	@Override
	public Employee get(String client, int empId) throws Exception {
		if (client.equals("ADMIN") || client.equals("USER")) {
			return emp.get(client, empId);
		}
		throw new Exception("Access Denied");
	}

}
