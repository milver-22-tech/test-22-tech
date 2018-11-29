package com.tech22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PuggyBank {
	
	private Map<String, Integer> coins;
	private final List<Integer> coinsValid = Arrays.asList(50, 100, 200, 500, 1000);
	public PuggyBank() {
		defineDenomination();
	}
	
	private void defineDenomination() {
		coins = new HashMap<>();
		for (Integer coin : coinsValid) {
			coins.put(coin.toString(), 0);
		}
	}
	
	public void setCoin(Integer coin) {
		if (coinsValid.contains(coin)) {
			coins.put(coin.toString(), coins.get(coin.toString()) + coin);
		} else {
			System.out.println("The coin isn't valid please insert a coin (50, 100, 200, 500, 1000)");
		}
	}
	
	public Integer getTotalCoins() {
		Integer totalCoins = 0;
		for (Integer key : coinsValid) {
			totalCoins = totalCoins + (coins.get(key.toString())/key);
		}
		return totalCoins;
	}
	
	public Integer getSpecificCoins(Integer key) {
		Integer totalSpecificCoins = 0;
		if (coinsValid.contains(key)) {
			totalSpecificCoins = coins.get(key.toString())/key;
		} else {
			System.out.println("There are'nt coin " + key + " please you introduce (50, 100, 200, 500, 1000)");
		}
		return totalSpecificCoins;
	}
}
