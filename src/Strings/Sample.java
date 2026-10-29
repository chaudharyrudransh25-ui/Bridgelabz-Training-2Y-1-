package Strings;

public class Sample {
    public static void main(String[] args) {
        // 1. Creating Strings
        String greeting = "Hello";
        String name = "Java Developer";

        // 2. String Concatenation (Joining strings)
        String welcomeMessage = greeting + ", " + name + "!";
        System.out.println("Message: " + welcomeMessage);

        // 3. Finding the length of a string
        int length = welcomeMessage.length();
        System.out.println("Length of string: " + length);

        // 4. Changing case
        System.out.println("Uppercase: " + welcomeMessage.toUpperCase());
        System.out.println("Lowercase: " + welcomeMessage.toLowerCase());

        // 5. Getting a character at a specific position (index)
        char firstLetter = greeting.charAt(0);
        System.out.println("First letter of greeting: " + firstLetter);

        // 6. Checking if a string contains a word
        boolean hasJava = welcomeMessage.contains("Java");
        System.out.println("Does it contain 'Java'? " + hasJava);

        // 7. Comparing two strings
        String str1 = "hello";
        // Always use .equals() instead of == to compare string values
        System.out.println("Case-sensitive match: " + greeting.equals(str1));
        System.out.println("Case-insensitive match: " + greeting.equalsIgnoreCase(str1));
    }
}

