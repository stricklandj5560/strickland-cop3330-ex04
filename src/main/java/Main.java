import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String noun, verb, adjective, adverb = "";
            System.out.print("Enter a noun: " );
            noun = scan.nextLine();
            System.out.print("Enter a verb: " );
            verb = scan.nextLine();
            System.out.print("Enter an adjective: ");
            adjective = scan.nextLine();
            System.out.print("Enter an adverb: ");
            adverb = scan.nextLine();
            System.out.println(
                    String.format("Do you %s your %s %s %s? That's not cool...",
                            verb,
                            adjective,
                            noun,
                            adverb));
        }
    }
}
