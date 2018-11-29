package com.tech22;

public class Main {

	public static void main(String[] args) {
		PuggyBank bank = new PuggyBank();
		bank.setCoin(100);
		bank.setCoin(200);
		System.out.println(bank.getTotalCoins());
		System.out.println(bank.getSpecificCoins(100));
	}
}