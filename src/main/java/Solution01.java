import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution01
{
    //prompt user for name using standard input
    //print greeting using name

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.printf("Hello, %s, nice to meet you!", name);
    }


}
