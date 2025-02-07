package programmingSkills;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public int romanToInt(String s) {
		// declare a map as a string key with integers as values
		Map<Character, Integer> romanMap = new HashMap<>();
		
		// populate the map
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int total = 0;
		int prevValue = 0;
		
		// iterate over the string from right to left
		for (int i= s.length() - 1; i >= 0; i--) {
			int currentValue = romanMap.get(s.charAt(i));
			
			// check to see if we need to subtract or add a value
			if (currentValue < prevValue) {
				total -= currentValue;
			} else {
				total += currentValue;
			}
			
			prevValue = currentValue; // update previous value for next iteration
		}
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger solution = new RomanToInteger();
		
		System.out.println(solution.romanToInt("III"));
		System.out.println(solution.romanToInt("IV"));
		System.out.println(solution.romanToInt("IX"));
		System.out.println(solution.romanToInt("LVIII"));
		System.out.println(solution.romanToInt("MCMXCIV"));
	}

}
