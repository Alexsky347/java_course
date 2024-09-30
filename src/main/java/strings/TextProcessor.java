package strings;

import java.util.Arrays;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Java");
        reverseString("Hello TAU!");
        addSpaces("HelloWorld!It'sMeVladimir");
        System.out.print(Arrays.toString(multiLines().split("\n")));
    }

    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    private static void reverseString(String text) {
//        StringBuilder reversedString = new StringBuilder(text);
//        reversedString = reversedString.reverse();
//        System.out.println(reversedString);
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }


    private static int countWords(String text) {
        int numberOfWords = text.split(" ").length;
        String message = String.format("The number of words in the string is %d", numberOfWords);
        System.out.println(message);
        return numberOfWords;
    }

    private static String multiLines(){
        return """
                This is a text block
                It can contain multiple lines
                and tabs
                """;
    }
}
