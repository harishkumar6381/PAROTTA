package org.inter;

public class Job implements School,College{

	@Override
	public void extra() {
		System.out.println("qwerty");
	}

	@Override
	public void sports() {
		System.out.println("asdfgh");
	}

	@Override
	public void tution() {
		System.out.println("zxcvbn");
		System.out.println("54321");
	}
	public static void main(String[] args) {
	Job j = new Job();
	j.extra();
	j.sports();
	j.tution();
	}
}
