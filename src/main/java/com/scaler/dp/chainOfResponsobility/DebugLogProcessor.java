package com.scaler.dp.chainOfResponsobility;

public class DebugLogProcessor extends LogProcessor {

	DebugLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	public void log(int logLevel, String message) {
		if (logLevel == DEBUG) {
			System.out.println("ERROR:" + message);
		} else {
			super.log(logLevel, message);
		}
	}
}
