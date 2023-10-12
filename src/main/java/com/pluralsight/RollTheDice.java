package com.pluralsight;
import java.util.*;
//get addicted to gambling, Jamie
public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int sum;
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;
        int roll_numbers = 100;
//jamie, roll that dice right now man
        for (int i = 0; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.println("Roll " + i + ": " + roll1 + " + " + roll2 + " Sum: " + sum);
            switch (sum) {
                case 2:
                    count2++;
                case 4:
                    count4++;
                case 6:
                    count6++;
                case 7:
                    count7++;
            }
                System.out.println("Sums of 2: " + count2 + "\nSums of 4: " + count4 + "\nSums of 6: " + count6 + "\nSums of 7: " + count7);

            }
        }
    }
