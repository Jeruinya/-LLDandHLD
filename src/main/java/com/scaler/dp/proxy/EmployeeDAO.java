package com.scaler.dp.proxy;

public interface EmployeeDAO {
	void create(String client, Employee e) throws Exception;

	void delete(String client, int empId) throws Exception;

	Employee get(String client, int empId) throws Exception;

}
