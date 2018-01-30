package info.spring.implementation;

import java.util.Date;

import info.spring.api.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}
}
