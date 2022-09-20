		package com.te.customexception;

import java.util.Scanner;

public class Bank {
	static User bank;
	static Scanner scanner;

	public void withdraw(long a) {
		if (bank.getBal() < 1) {
			try {
				throw new NotSufficientFund("you have unsufficinet funds in acc");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} else {
			long amount = bank.getBal() - a;
			bank.setBal(amount);
			System.out.println("Your Balance is :" + bank.getBal());
		}
	}

	public static void main(String[] args) {
		bank = new User("darshan", 10000l, 202020l);
		// User bank2 = new User("amit",100,1010100);

		Bank account = new Bank();
		account.withdraw(5000);
		// bank.getBal();

	}
}
