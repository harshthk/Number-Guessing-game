package numberguessing;
import java.util.*;
public class numberGuessingusingwhile {
	static int randomnumber;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int guessingnumber =1;
		int userinput = 0;
		System.out.println(generatenumber());
		while(guessingnumber != -1) {
			System.out.print("Enter the value between 1 to 100:- ");
			userinput = scan.nextInt();
			guessingnumber=checknumber(userinput);
		}
		System.out.println("Correct number is " + randomnumber 
				+"\nYour guessing is correct");
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
