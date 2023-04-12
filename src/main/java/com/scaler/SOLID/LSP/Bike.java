package com.scaler.SOLID.LSP;

/*
->If class B is subtype of class A, then we should be able to replace object of A with B without breaking the behavior of the program/application
->Sub class should extend the capabilities of parent class and not narrow down it. 
 */
public interface Bike {
	void turnOnEngine();

	void accelerate();

}