package inputOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age is = "+age);

        System.out.println();

        System.out.println("Enter 2 nos:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum of no1 and no: "+(num1+num2));
    }
}
