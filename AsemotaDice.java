//Program written by Efosa Asemota
import java.util.Random;
import java.util.Scanner;

public class AsemotaDice {

    static Random dice = new Random(); //Generates a random number.
    static final int numOfRolls = 36000000; //Number of rolls that will be performed. Made the variable a const since it will never change.
    static int []results = new int [13]; //Holds the the total number of outcomes after each roll. Each index corresponds to an outcome.


    public static void main(String[] args){
        int die1, die2; //initialization of the pair of dice
        int sum; //initialization of the sum

        System.out.println("Hello! This is the roll of dice program!");
        System.out.println("It will simulate the roll of a pair of dice.");

        System.out.println("Rolling...");

        for (long i = 0; i < numOfRolls; i++) { //looping through each roll
            die1 = dice.nextInt(6) + 1; //sets the range of the possible die outcomes (1-6).
            die2 = dice.nextInt(6) + 1; //sets the range of the possible die outcomes (1-6).
            sum = die1 + die2; //adding up the sums of die1 and die2
            results[sum]++; //incrementing the element at that array index (number of times that result comes up in the array)
        }

        System.out.printf("%-8s%-8s\n", "Result", "Total"); //formatting the printing of results
        System.out.println("---------------"); //More formatting for aesthetic reasons.
        for (int i = 2; i <= 12; i++) { //looping through each possible sum. Starting from 2 since the sum will never get below 2 and ending at 12 since the result will never go past 12.
            System.out.printf("%-8d%-8d\n", i, results[i]); //Printing the results
        }




    }
}
