package com.scaler.lldANDhld.prototype.deepCloning;

public class Employee implements Cloneable {
	private int empId;
	private String empName;
	private Department department;

	public Employee(int empId, String ermpName, Department dptName) {
		super();
		this.empId = empId;
		this.empName = ermpName;
		this.department = dptName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ermpName=" + empName + ", dptName=" + department + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getErmpName() {
		return empName;
	}

	public void setErmpName(String ermpName) {
		this.empName = ermpName;
	}

	public Department getDptName() {
		return department;
	}

	public void setDptName(Department dptName) {
		this.department = dptName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.department = (Department) department.clone();
		
		return e;
	}
}
