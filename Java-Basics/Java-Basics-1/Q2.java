/*
 * Number Pattern
 * Author: Maheen Fatima
 * Version: 1.0
 * This program displays a decreasing number pattern using for loop.
 * */

public class Q2 {
	public static void main(String[] args) {
		for (int i=6; i>=1; i--) {
			for(int j=1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
