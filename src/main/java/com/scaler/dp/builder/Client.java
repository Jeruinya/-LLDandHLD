package com.scaler.dp.builder;

public class Client {

	public static void main(String[] args) {
        Student.Helper studentBuilder  = Student.getBuilder();
        Student student = studentBuilder
                .setAge(12)
                .setName("dsds")
                .setPsp(1.22)
                .setEmail("sdsds")
                .build();
        System.out.println(student);
        //here we an not create Student class object directly as its constructor is private 
    }
}
