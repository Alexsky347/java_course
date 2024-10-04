package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        File fileInput = new File("files/numbers.txt");
        File output = new File("files/output.txt");
        Scanner fileReader = null;
        try{
            fileReader =  new Scanner(fileInput);
            PrintWriter fileWriter = new PrintWriter(output);
            while (fileReader.hasNext()){
                fileWriter.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("Sorry an error occurred: " + e.getMessage());
        } finally {
            fileReader.close();
            System.out.println("File closed");
        }
    }
}
