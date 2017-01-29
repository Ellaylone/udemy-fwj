import java.util.Scanner;

public class HiLo {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        String playAgain = "";

        //game loop
        do {
            int theNumber = (int)(Math.random() * 100 + 1);
            int guess = 0;

            while (guess != theNumber) {
                System.out.println("Guess a number between 1 and 100:");

                guess = scan.nextInt();

                if (guess < theNumber) {
                    System.out.println(guess + " is too low");
                } else if (guess > theNumber) {
                    System.out.println(guess + " is too high");
                } else {
                    System.out.println(guess + " is the correct number!");
                }
            }

            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing! Goodbye.");
    }
}
