package com.util.jav.practice;

import java.util.ArrayList;

public class GenericExample1 {

	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();
		ArrayList<Double> dList = new ArrayList<Double>();
		String clazzOne = sList.getClass() + "";
		String clazzTwo = dList.getClass() + "";
		System.out.println("sList.getClass(): " + clazzOne);
		System.out.println("dList.getClass(): " + clazzTwo);
		if (clazzOne.equals(clazzTwo)) {
			System.out.println("Equal!!!");
		} else {
			System.out.println("Not Equal!!!");
		}

	}

}
