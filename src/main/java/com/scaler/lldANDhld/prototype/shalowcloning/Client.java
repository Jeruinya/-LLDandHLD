package com.scaler.lldANDhld.prototype.shalowcloning;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department d = new Department(10, "Finance");
		Employee emp = new Employee(101, "Rahul", d);

		Employee e = (Employee) emp.clone();
		// Lets change department name in cloned object and will varify in original
		// object
		e.getDptName().setName("HR");
		System.out.println(emp.getDptName().getName());
		System.out.println(e);
		System.out.println(emp);
		
		e.setEmpId(1000);
		
		System.out.println(e);
		System.out.println(emp);
		
//In shallow cloning its is possible to clone the primitives but object cloning will give error and it will impact the original object as well.		
		

	}

}
