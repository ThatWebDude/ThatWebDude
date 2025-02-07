package programmingSkills;

public class StringToLowercase {

	public String toLowerCase(String s) {
		
		String newString = s.toLowerCase();
		
		return newString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToLowercase solution = new StringToLowercase();
		
		String string = "EverY Word HAs an UppErCase LeTteR";
		
		System.out.println(solution.toLowerCase(string));
				
	}

}
