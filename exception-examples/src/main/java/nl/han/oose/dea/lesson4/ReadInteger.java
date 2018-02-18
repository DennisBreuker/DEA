package nl.han.oose.dea.lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do {
            /*
             * Risico code embedded in try-catch
             */
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();
                System.out.println("The number entered is "+ number);
                
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required");
                input.nextLine();
            }
            
        } while (continueInput);
        
    }
}