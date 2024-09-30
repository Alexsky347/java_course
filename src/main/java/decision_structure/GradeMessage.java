package decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        // switch statement
        switch(grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }

        //switch expression
        String message2 = switch(grade) {
            case "A", "B" -> "Excellent job!";
            case "C" -> {
                yield "Good job!";
            }
            case "D" -> "You need to work a bit harder.";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade.";
        };

        System.out.println(message2);
    }
}
