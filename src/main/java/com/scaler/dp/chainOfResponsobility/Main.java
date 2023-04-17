package com.scaler.dp.chainOfResponsobility;
/*
We can use this example to explain the LLD of logger system
 */
public class Main {

	public static void main(String[] args) {
		LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

		logger.log(logger.INFO, "just for information");
		logger.log(logger.ERROR, " Exception happend");
		logger.log(logger.DEBUG, "Need to debug");

	}

}
