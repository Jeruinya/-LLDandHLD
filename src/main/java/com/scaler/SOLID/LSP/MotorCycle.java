package com.scaler.SOLID.LSP;
/*
Here in the Bicycle class we are narrowing the capability because Bicycle does not have the capability of turning on the engine because in Bicycle 
there is no engine.

 */
class MotorCycle implements Bike {

	boolean isEngineOn;
	int speed;

	@Override
	public void turnOnEngine() {
		// TODO Auto-generated method stub

	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub

	}

}

class Bicycle implements Bike {

	boolean isEngineOn;
	int speed;

	@Override
	public void turnOnEngine() {
		throw new AssertionError("There is no Engine");

	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub

	}

}