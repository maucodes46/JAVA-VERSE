/*
 * Numbers with their squares
 * Author: Maheen Fatima
 * Version: 1.0
 * This program displays first five numbers and their squares using for and while loop.
 * */
public class Q4 {
	public static void main(String[] args) {
		System.out.println("First five Numbers and their Squares using For loop:");
		System.out.println("\nBy using For loop:");
		System.out.println("Number"+"\t"+"Square");
		for(int i=1;i<=5;i++) {
			System.out.println(i+"\t"+i*i);
		}
		System.out.println("\nBy using While loop:");
		System.out.println("Number"+"\t"+"Square");
		int i=1;
		while(i<=5) {
			System.out.println(i+"\t"+i*i);
			i++;
		}
	}
}