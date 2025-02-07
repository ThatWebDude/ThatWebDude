package programmingSkills;

import java.util.Scanner;

public class IndexOfFirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String haystack = scnr.next();
		String needle = scnr.next();
		
		int result = strStr(haystack, needle);
		
		scnr.close();
		
		System.out.println(result);
	}
	
	// This solution works for the LeetCode problem, but there is no testing
	// for what would happen if haystack is empty or if the needle is larger
	// than the haystack. If the haystack is smaller than the needle, it would
	// be a substring of needle and not the other way around as the problem
	// originally states.
	
	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}

}
