import java.util.Scanner;
import java.util.Random;
public class ex1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JERBIN M");
		System.out.println("URK24CS1265");
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numberToGuess = rand.nextInt(100) + 1;
		int guess, attempts = 0;
		System.out.println("Guess the number between 1 and 100:");
		while (true) {
		System.out.print("Enter your guess: ");
		guess = sc.nextInt();
		attempts++;
		if (guess > numberToGuess) {
		System.out.println("Too High");
		} else if (guess < numberToGuess) {
		System.out.println("Too Low");
		} else {
		System.out.println("Correct Guess in " + attempts + " attempts!");
		break;
		}
		}
	}

}
