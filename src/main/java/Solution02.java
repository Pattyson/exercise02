import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Patrick Brookshire
 */

public class Solution02{

    public static void main(String[] agrs) {

        String str1;
        int strlength;

        System.out.println("What is the input string?");

        Scanner input = new Scanner(System.in);
        str1 = input.next();

        strlength = str1.length();

        System.out.println( str1 + " has " + strlength + " characters.");
    }
}