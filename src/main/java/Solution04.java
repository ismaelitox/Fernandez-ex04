/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;
// class to contain solution04 code
public class Solution04 {

    // creating scanner once to parse input
    static Scanner in = new Scanner(System.in);
    // main driver method
    public static void main(String[] args) {
        // all methods will be 'private' for security/ not to be used
        // outside scope of 'solution04'
        // initializing string objects
        // 'noun' for getNoun method
        // 'verb' for getVerb method
        // 'adjective' for getAdjective method
        // 'adverb' for getAdverb method
        // output string will take all return values from methods
        // and print single concat output
        //  all will extend 'solution04'
        String noun = getNoun();
        String verb = getVerb();
        String adjective = getAdjective();
        String adverb = getAdverb();
        // one string variable combining all variables
        String outputString = generateOutputString(noun, verb, adjective, adverb);

        printOutput(outputString);

    }
    // method used to print output string to console
    // private access modifier for use only within 'Solution04'
    // taking string from 'generateOutputString()'
    // void function returns no value
    private static void printOutput(String outputString) {
        System.out.println(outputString);
    }

    // method used to generate output string
    // private access modifier for use within 'solution04' class
    // taking 'adverb,adjective,verb and noun' from 'in.nextLine();' and passing it into output statement
    // returning value will be passed to 'printOutput'
    // Uses of concat for single output statement
    // s1 declared final, after its created cannot be changed
    private static String generateOutputString(String noun, String verb, String adjective, String adverb) {
        return "Do you " + verb + " your " + adjective + " " + noun +" " + adverb + "? That's hilarious!";
    }
    // method used to generate adverb
    // print statement asking user for input
    // nextLine receives input
    // returning user input
    // declared static for single instance
    private static String getAdverb() {
        System.out.print("Enter an adverb: ");
        return in.nextLine();
    }
    // method used to generate adjective
    // print statement asking user for input
    // nextLine receives input
    // returning user input
    // declared static for single instance
    private static String getAdjective() {
        System.out.print("Enter an adjective: ");
        return in.nextLine();
    }
    // method used to generate verb
    // print statement asking user for input
    // nextLine receives input
    // returning user input
    // declared static for single instance
    private static String getVerb() {
        System.out.print("Enter a verb: ");
        return in.nextLine();
    }
    // method used to generate noun
    // print statement asking user for input
    // nextLine receives input
    // declared static for single instance
    private static String getNoun() {
        System.out.print("Enter a noun: ");
        return in.nextLine();
    }
}
