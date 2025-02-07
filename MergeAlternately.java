package programmingSkills;

import java.util.Scanner;
import java.util.LinkedList;

/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating 
order, starting with word1. If a string is longer than the other, append the additional letters 
onto the end of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
*/

public class MergeAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "";
		String last = "";
		
		System.out.println("Enter two words: ");
		Scanner scnr = new Scanner(System.in);
		
		first = scnr.next();
		last = scnr.next();
		
		scnr.close();
		
		mergeString(first, last);
		
	}

	private static void mergeString(String word1, String word2) {
		// TODO Auto-generated method stub
		// Steps;
		
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		
		StringBuilder merged = new StringBuilder();
		
		
		int i = 0;
		int j = 0;
		
		while(i < word1Array.length || j < word2Array.length) {
			if (i < word1Array.length) {
				merged.append(word1Array[i++]);
			}
			if (j < word2Array.length) {
				merged.append(word2Array[j++]);
			}
		}
		
		String mergedString = merged.toString();
		System.out.println(mergedString);
	}
}
