package Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Random Number Game");
        Random rd = new Random();
        int sysInput = rd.nextInt(10);
        int attempts = 0;
        boolean isGameOver = false;
        Scanner sc = new Scanner(System.in);
        while(!isGameOver){
            System.out.println("Choose the number between 0 to 10");
            int userInput = sc.nextInt();

            if(userInput == sysInput){
                System.out.println("Game is Over");
                attempts++;
                isGameOver = true;

                System.out.println("UserInput: "+userInput);
                System.out.println("System Input: "+sysInput);
                System.out.println("Attempts: "+attempts);
                System.out.println("Number is matched");
            }
            else if(userInput > 10 || userInput < 0){
                System.out.println("Please choose between the range");
                userInput = sc.nextInt();
            }
            else{
                attempts++;
                System.out.println("Number is not matched ");
            }
        }

    }
}
