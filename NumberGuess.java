import java.util.*;

public class NumberGuess {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        int up_Bound = 100;
        int lw_Bound = 1;
        int score = 0;
        int maxAttempts = 10;

        boolean play = true;

        

        while(play){
            int targetNumber = r.nextInt(up_Bound - lw_Bound + 1) + lw_Bound;
            int attempts = 0;

            System.out.println("\n--------Welcome to the Number Guessing Game ----------\n");
            System.out.println("Please Guess the no. of a number b/w "+ lw_Bound + " and " + up_Bound + ".");


            while ( attempts < maxAttempts){
                System.out.print("Enter Your Guess number : ");
                int guess = sc.nextInt();
                sc.nextLine();

                attempts++;

                if(guess == targetNumber) {
                    System.out.println("Congrations! You guessed the number in "+ attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                    break;
                } else if( guess < targetNumber) {
                    System.out.println("Too low . Try again .");
                } else {
                    System.out.println("Too high . Try again.");
                }

                if(attempts == maxAttempts) {
                    System.out.println("You have reached the maximum number of attempts. The number was : "+ targetNumber);
                }
            }

            System.out.println("Your current score is : "+score);

            System.out.println("Do you want to play again this game ? (yes/no): ");
            String playResponce  = sc.nextLine();
            play = playResponce.equalsIgnoreCase("Yes");
        }

        System.out.println("Thanks for playing hope you enjoyed!");
    }
    
}
