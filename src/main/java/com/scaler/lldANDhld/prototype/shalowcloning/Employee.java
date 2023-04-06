package com.scaler.lldANDhld.prototype.shalowcloning;

public class Employee implements Cloneable {
	private int empId;
	private String ermpName;
	private Department dptName;

	public Employee(int empId, String ermpName, Department dptName) {
		super();
		this.empId = empId;
		this.ermpName = ermpName;
		this.dptName = dptName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getErmpName() {
		return ermpName;
	}

	public void setErmpName(String ermpName) {
		this.ermpName = ermpName;
	}

	public Department getDptName() {
		return dptName;
	}

	public void setDptName(Department dptName) {
		this.dptName = dptName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ermpName=" + ermpName + ", dptName=" + dptName + "]";
	}

}
