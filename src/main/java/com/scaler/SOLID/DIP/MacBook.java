package com.scaler.SOLID.DIP;

/*
Class should be dependent on interfaces rather than concrete classes.
Here we are doing concrete object assignment which is wrong as per rule of DIP
 */
public class MacBook {
	private final WiredKeyboard keyboard;
	private final WiredMouse mouse;

	public MacBook() {
		keyboard = new WiredKeyboard();
		mouse = new WiredMouse();
	}

}
