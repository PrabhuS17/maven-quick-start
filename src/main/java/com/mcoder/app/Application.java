package com.mcoder.app;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 */

/**
 * @author PRABHU
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside app");
		
		List<String> list = new ArrayList<>();
		
		list.add("Welcome");
		
		for(String s: list) {
			System.out.println(s);
		}
		
		int count  = countWords("I have four words");
		System.out.println("Count "+ count);
		
	}

	private static int countWords(String string) {

		String a[] = StringUtils.split(string, " ");
		return a == null ? 0 : a.length ;
	}

}
