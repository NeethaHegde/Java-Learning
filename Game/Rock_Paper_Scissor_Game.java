package Game;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        System.out.println("Please enter the below options");
        System.out.println("0. for Rock\n1. for Paper\n2. for Scissor");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random rd = new Random();
        int sysInput = rd.nextInt(3);
        
        if(userInput == sysInput){
            System.out.println("Draw!");
        }
        else if((userInput == 0 && sysInput == 2) || (userInput == 1 && sysInput == 0) || (userInput == 2 && sysInput ==1)){
            System.out.println("You win!!!");
        }
        else{
            System.out.println("You Loose");
        }
        System.out.println("User Input: "+userInput);
        System.out.println("System Input: "+sysInput);
    }
}
