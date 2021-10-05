public class mywork {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		
		if (getPalindromeNumber(x) == 2)
			System.out.println(x + " is a palindrome");
		else
			System.out.println(x + "is not ");
	}
	
	public static int getPalindromeNumber (int input1) {
		String xStr = String.valueOf(input1);
        boolean Palindrome = true;
		int Count = xStr.length();
		
		
		int range = Count / 2;
		if (Count % 2 == 0) range--;
		
		for (int i = 0; i <= range; i++) {
			if (xStr.charAt(i) != xStr.charAt(Count - i - 1)) Palindrome = false;
		}
		
		if (Palindrome == true) return 2;
		else return 1;
	}

}