import java.util.Scanner;
import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {

		System.out.println("Hello! Guess which will have more: heads or tails?");

		Scanner scanner = new Scanner(System.in);
		String headsOrTailsGuess = scanner.nextLine();
		
		if (!headsOrTailsGuess.equals("heads") && !headsOrTailsGuess.equals("tails")  ) {
			System.out.println("Please restart and enter either heads or tails");
			return;
		}

		System.out.println("How many times shall we flip a coin?");

		int numberOfFlips = scanner.nextInt();

		Random random = new Random();

		int correctCount = 0;

		for (int i = 1; i <= numberOfFlips; i++) {
			int randomNumber = random.nextInt(2);

			if (randomNumber == 0) {
				System.out.println("heads");
				if (headsOrTailsGuess.equals("heads")) {
					correctCount++;
				}
			} else {
				System.out.println("tails");
				if (headsOrTailsGuess.equals("tails")) {
					correctCount++;
				}
			}

		}

		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");

		float percentageCorrect = (correctCount * 100.0f) / numberOfFlips;

		System.out.println("That's " + percentageCorrect + "%.");

	}

}
