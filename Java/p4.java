
/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class p4{

	public static void main(String[] args) {
		//largest 3 digit number is 999
		int max = 0;
		for(int i = 999; i >= 0; i--) {
			for(int j = 999; j >= 0; j--) {
				int n = i * j;
				if (isPalindrome(n)) {
					if(n > max)
						max = n;
				}
			}
		}
		System.out.print(max);
	}
	
	static Boolean isPalindrome(int n) {
	   String original, reverse = ""; // Objects of String class  
	   original = Integer.toString(n);   
	   int length = original.length();   
	   for ( int i = length - 1; i >= 0; i-- )  
		   reverse = reverse + original.charAt(i); 
	   return original.equals(reverse);
	}

}