package com.te.customexception;

public class Election {

	public void vote(int age) {
		if (age < 18) {
			try {
				throw new NotEligibleException("you are not eligible");
			} catch (NotEligibleException e) {
				System.out.println(e.getMessage());
			}
		} else

			System.out.println("casted vote succesfull");
	}

	public static void main(String[] args) {
		Voter voter = new Voter("darshan", 20, 1);
		Voter voter2 = new Voter("amit", 10, 2);

		Election election = new Election();
		election.vote(voter.getAge());
		election.vote(voter2.getAge());
	}
}
