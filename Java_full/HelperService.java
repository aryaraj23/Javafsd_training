package com.ust.examples;
/*
 * Abstract
 */


final class HelperService {
	final String formatNumber(int value)
	{
		return String.format("%d", value);
	}
	
	final String formatNumber(double value)
	{
		return String.format("%.3f", value);
	}
	
	final String formatNumber(String value)
	{
		return String.format("%.2f", Double.parseDouble(value));
	}
	
	public static void main(String[] args) {
		HelperService hs = new HelperService();
		System.out.println(hs.formatNumber(500));
		System.out.println(hs.formatNumber(56.324));
		System.out.println(hs.formatNumber("654"));

	}

}
