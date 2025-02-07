package programmingSkills;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagramDemo {

	public static void main(String[] args) {
	
		System.out.println("Enter two strings: ");
		Scanner scnr = new Scanner(System.in);
		String s = scnr.next();
		String t = scnr.next();
		
		scnr.close();
		
		boolean answer = isAnagram(s, t);
		
		System.out.println(answer);

	}

	private static boolean isAnagram(String s, String t) {

		// test to see if strings are the same length since anagrams are always equal in length.
		if (s.length() != t.length()) return false;
		
		// convert strings to character arrays and sort
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		
		// compare the arrays
		return Arrays.equals(sArray, tArray);
	}	
}
