
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class p3{

	public static void main(String[] args) {
		long n = 600851475143L;
		//2 is the smallest prime number
		int i = 2;
		//prime factors will be < than the square root of n
		while (i < Math.sqrt(n)) {
			//if i is a factor of n
			while (n%i == 0)
				// make n smaller my dividing by its prime factor
				n = n/i;
			i++;
		}
		System.out.println(n);
	}
}