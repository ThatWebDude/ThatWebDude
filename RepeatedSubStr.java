package programmingSkills;

import java.util.Scanner;

public class RepeatedSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a string to check: ");
		
		String s = scnr.next();
		
		Boolean bool = repeatedSubstringPattern(s);
		
		System.out.println(bool);
		
	}

	private static Boolean repeatedSubstringPattern(String s) {
		// taking the string and repeatedly dividing the string down until you get
		// individual letters to see if there is a repeating pattern.
		
		int len = s.length(); // get the length of the string to be checked.
		
		for(int i = len/2; i > 0; i--) { 					// iterate over possible substring lengths.
			if (len % i == 0) {			 					// Check to see of the length is divisible by i.
				int num_substrings = len / i;
				StringBuilder sb = new StringBuilder();
				String str = s.substring(0, i);				// extract the substring of length i.
				
				for (int j = 0; j < num_substrings; j++) {	// construct the repeated version of the 
					sb.append(str);							// substring.
				}
				if (sb.toString().equals(s)) return true;	// if the constructed string matches
			}												// the original string, return true.
		}		
		return false;
	}

}
