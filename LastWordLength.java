package programmingSkills;

public class LastWordLength {

	public int lengthOfLastWord(String s) {
		// method declarations
		int length = 0;
		int i = s.length() - 1;
		char[] words = s.toCharArray();
		
		// looking for spaces from the end of the sentence to the start
		while (i >= 0 && words[i] == ' ') {
			i -= 1;
		}
		// when no spaces are found, start counting letters until a space occurs
		// or length gets to 0
		while (i >= 0 && words[i] != ' ') {
			length += 1;
			i -= 1;
		}
			
		return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastWordLength string = new LastWordLength();
		
		String sentence = "Last";
		
		System.out.println(string.lengthOfLastWord(sentence));
	}

}
