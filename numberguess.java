import java.util.*;
import java.util.Random;

public class numberguess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("\nRULES");

        System.out.println("You have to guess the number that I am thinking between 1 and 100");

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; //generating random number b/w 1 and 100

        System.out.println("\nDifficulty level");

        System.out.println("1. Easy - 10 chances");

        System.out.println("2. Medium - 5 chances");

        System.out.println("3. Hard -3 chances");
        System.out.print("\nSelect difficulty level : ");
        int choice = in.nextInt();

        switch(choice) {

            case 1: {
                System.out.println("You have 10 chances to guess the number");

                for (int i = 1; i <= 10; i++) {
                    System.out.print("Guess the number : ");
                    int n = in.nextInt();

                    if (n == randomNumber) {
                        System.out.println("Congratulation, You guessed it correct");
                        System.out.println("It took " + i + " tries.");

                    } else if (n > randomNumber) {
                        System.out.print("You are wrong.Number is less than " + n +".");
                        System.out.println("\nTRY AGAIN");
                    } else if(n < randomNumber) {
                        System.out.println("You are wrong.Number is greater than " + n +".");
                        System.out.println("\nTRY AGAIN");
                    } else {
                        System.out.print("\nIf you want to see the number enter 5 : ");
                        int org = in.nextInt();
                        if (org == 5)
                            System.out.println("Number that I was thinking was '" + randomNumber + "'.");
                    }
                }
            }


            case 2: {
                System.out.println("You have 5 chances to guess the number");

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Guess the number : ");
                    int n = in.nextInt();

                    if (n == randomNumber) {
                        System.out.println("Congratulation, You guessed it correct");
                        System.out.println("It took " + i + " tries.");

                    } else if (n > randomNumber) {
                        System.out.println("You are wrong.Number is less than " + n + ".");
                        System.out.println("TRY AGAIN");
                    } else if (n < randomNumber) {
                        System.out.println("You are wrong.Number is greater than " + n +".");
                        System.out.println("TRY AGAIN");
                    } else {
                        System.out.println("You are wrong. Try again");
                    }

                }
                System.out.print("If you want to see the number enter 5 : ");
                int org = in.nextInt();
                if (org == 5) {
                    System.out.println("Number that I was thinking was '" + randomNumber + "'.");
                }
            }

            case 3: {
                System.out.println("You have 3 chances to guess the number");

                for (int i = 1; i <= 3; i++) {
                    System.out.println("Guess the number : ");
                    int n = in.nextInt();

                    if (n == randomNumber) {
                        System.out.println("Congratulation, You guessed it correct");
                        System.out.println("It took " + i + " tries.");
                    } else if (n > randomNumber) {
                        System.out.println("You are wrong. Number is less than " + n + ".");
                        System.out.println("TRY AGAIN");
                    } else if (n < randomNumber) {
                        System.out.println("You are wrong.Number is greater than " + n + ".");
                        System.out.println("TRY AGAIN");
                    } else {
                        System.out.println("You are wrong. Try again");
                    }
                }
                System.out.print("If you want to see the number enter 5 : ");
                int org = in.nextInt();
                if (org == 5)
                    System.out.println("Number that I was thinking was '" + randomNumber + "'.");
            }

            in.close();
        }
    }
}