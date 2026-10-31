/* Prime numbers from 1 to 100. */
// package control_structures;
public class Prime_Number {
	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100 : ");
	    for (int num = 2; num <= 100; num++) {
// assume that the num is prime
	            boolean prime = true;
//check if num has factor other than 1 and itself
	            for (int i = 2; i < num; i++) {
	                if (num % i == 0) {
	                    prime = false;
	                    break;
	                }
	            }
//if no factor found, print that number
	            if (prime == true) {   
	                System.out.print(num + " ");
	            }
	    
	    }
	    }
}
