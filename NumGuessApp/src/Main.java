import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println("RandomNum" + randomNum);

        int numOfGuesses = 0;
        while (numOfGuesses < 5) {
            int enteredNum = collectNum(scanner);
            if (enteredNum <= 100 && enteredNum > 0) {
                if (enteredNum > randomNum) {
                    System.out.println("Please pick a lower number");
                } else if (enteredNum < randomNum)
                    System.out.println("Please pick a higher number");
                else {
                    System.out.println("you win");
                    break;
                }
                numOfGuesses++;
            } else {
                System.out.println("Your guess is not between 1 and 100, please try again");
            }
            if (numOfGuesses >= 5) {
                System.out.println("You lose, the number to guess was the RandomNumber=" + randomNum);
            }
        }
    }

    private static int collectNum(Scanner scanner) {
        System.out.println("Pick a number between 1 and 100");
        int guessNum = scanner.nextInt();
        return guessNum;
    }
}
