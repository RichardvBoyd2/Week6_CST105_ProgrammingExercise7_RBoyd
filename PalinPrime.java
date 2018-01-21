/** Program:
 * File:
 * Summary:
 * Author: Richard Boyd
 * Date:
 */

public class PalinPrime {

	public static void main(String[] args) {
		int num = 1;
		while (num != 100001) {
			if (prime(num) == true && palin(num)) {
				System.out.println(num);
			}
			num++;
		}
	}
	
	public static boolean prime (int test) {
		boolean result = false;
		int div = 2;
		if (test == 1) {
			result = false;
		}
		
		else if (test == 2) {
			result = true;
		}
		
		else if (test > 2){
			while (div != test) {
				if (test % div == 0) {
					result = false;
					div = test;
				}
				
				else if (test % div != 0) {
					div++;
					if (div ==test) {
						result = true;
					}
				}
			}
		}
			
		return result;
	}
	
	public static boolean palin (int test) {
		int forward = test, reverse = 0, remainder;
		while (forward != 0) {
			remainder = forward % 10;
			reverse = reverse * 10 + remainder;
			forward = forward / 10;
		}
		
		return  test == reverse;
	}

}
