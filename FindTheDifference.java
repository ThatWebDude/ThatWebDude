package programmingSkills;

import java.util.Scanner;

public class FindTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter two strings: ");
		String firstWord = scnr.next();
		String secondWord = scnr.next();
		
		scnr.close();
		
		char c = findTheDifference(firstWord, secondWord);
		
		System.out.println(c);
		
	}
	
	public static char findTheDifference(String s, String t) {
		
		char result = 0;
		
		// XOR all characters in String s
		for (char c : s.toCharArray()) {
			result ^= c;
		}
		
		// XOR all characters in String t
		for (char c : t.toCharArray()) {
			result ^= c;
		}
		
		// the remaining character will be the extra one
		
		return result;
	}

}
