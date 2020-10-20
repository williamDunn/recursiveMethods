package recursiveEC;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(raiseToPower(10,2));
		System.out.println(isPalindrome("b"));
		System.out.println(sumDigits(57));
		//System.out.println(convertToBinary(9));
		System.out.println(reverseString("hello"));

	}
	
	/////////////////////////////////////////////////////////
	
	public static int raiseToPower(int base, int ex){
		if(ex==0)
			return 1;
		else
			return (base*raiseToPower(base, ex-1));
	}
	
	/////////////////////////////////////////////////////////
	
	public static boolean isPalindrome(String str){
		if(str.length() < 2)
			return true;
		if(str.charAt(0) != str.charAt(str.length()-1))
			return false;
		return isPalindrome(str.substring(str.charAt(1), str.charAt(str.length()-1)));
	}
	
	/////////////////////////////////////////////////////////

	public static int sumDigits(int num){
		
		if(num == 0)
			return num;
		else
			return (num%10 + sumDigits(num/10));
	}
	
	/////////////////////////////////////////////////////////

	public static void convertToBinary(int num){
		if(num/2 != 0)
			convertToBinary(num/2);
		System.out.println(num%2);
		
	}
	
	/////////////////////////////////////////////////////////
	
	public static String reverseString(String str){
		if(str.length()<=1)
			return str;
		else
			return reverseString(str.substring(1, str.length())) + str.charAt(0);
	}
}
