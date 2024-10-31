package writingprogram;

import java.util.Scanner;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */


public class Program_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //scanner declaration for reading input form console

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);

        //closing the scanner object
        scanner.close();

    }

    //checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used

        String evenOrOdd = (number % 2 == 0) ? "Even0"  :  "Odd";
        System.out.println("The"  +  number  + " is " + evenOrOdd + "number");
    }
}
