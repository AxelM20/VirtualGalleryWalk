import java.util.Scanner;

public class VirtualGalleryWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Twisted Palindrome Detector!");

        // Introduction
        System.out.println("This tool detects palindromes... with a twist!");
        System.out.println("It ignores spaces, punctuation, and case when checking your phrase.\n");

        while (true) {
            System.out.print("Enter a word or phrase (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Normalize: remove non-letter characters and convert to lowercase
            String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
            String reversed = new StringBuilder(normalized).reverse().toString();

            if (normalized.isEmpty()) {
                System.out.println("Please enter a valid word or phrase.");
            } else if (normalized.equals(reversed)) {
                System.out.println("\"" + input + "\" is a palindrome!");
            } else {
                System.out.println(" \"" + input + "\" is not a palindrome.");
            }
            System.out.println(); // Blank line for readability
        }

        System.out.println("Thanks for trying the Twisted Palindrome Detector!");
        scanner.close();
    }
}
