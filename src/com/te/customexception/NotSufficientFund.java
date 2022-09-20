package com.te.customexception;

@SuppressWarnings("serial")
public class NotSufficientFund extends Exception {
public NotSufficientFund(String message) {
	super(message);
}
}
