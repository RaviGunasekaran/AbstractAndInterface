package com.test.FINALtests;

public class FinalAndStaticCombined {

	static String sVariable = "Welcome to STATIC Variable";

	public static void main(String[] args) {
		final String fVariable = "Welcome to FINAL Variable";
		System.out.println("Print FINAL Variable = " + fVariable);
		System.out.println("Print STATIC Variable = " + sVariable);
		System.out.println("Append STATIC Variable : " + sVariable + " - Hey I'm Add to STATIC");

	}

}
