package numberguessing;

import java.util.Scanner;

public class numberguessingusingfor {
	static int randomnumber;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int guessingnumber =1;
		int userinput = 0;
		System.out.println(generatenumber());
		int n =5;
		int i;
		System.out.println("Here you will get five chances. ");
		for(i=0; i<n; i++) {
			if(guessingnumber != -1) {
			System.out.print("Enter the value between 1 to 100:- ");
			userinput = scan.nextInt();
			guessingnumber=checknumber(userinput);
			}
		}
		if(i==5 && guessingnumber != -1) {
		System.out.println("Correct number is " + randomnumber 
				+"\nYour guessing is not correct");
		}else {
			System.out.println("Correct number is " + randomnumber 
					+"\nYour guessing is correct");
		}
	}
	public static int generatenumber() {
		randomnumber = (int)(Math.random()*101);
		return randomnumber;
	}
	public static int checknumber(int guess) {
		if(randomnumber == guess) {
			return -1;
		}else {
			return guess;
		}
	}
}
