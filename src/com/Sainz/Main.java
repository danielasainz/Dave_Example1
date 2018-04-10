package com.Sainz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        int x;
        //have to give x a value - if we set it to zero, it is less than 10. If you don't increment it, it's an endless loop (or infinite loop)
        //we often do while loop just to get input from the user
        //if we know the number of times, we can do a for loop
        x = 0;
        System.out.println("How many times do you want to run?");
        //x = keyboard.nextInt(); (changed this to below)
        int y = keyboard.nextInt();
        //after using anything that's not .nextLine();
        keyboard.nextLine();
        //whatever's in the curly braces will repeat until...
        //if x<10, it's true, if x>10, it's false. If this is true, the loop repeats
        while (x < y) {
            System.out.println(x);
            x++;
        }
        System.out.println("The loop is over");
    }
}


