package nl.han.oose.dea.lesson4;

public class ThrowAnException1 {
    public static int quotient(int teller, int deler) {
        return teller/ deler;
    } 

    public static void main(String[] args) {
        // geen probleem
        System.out.println(quotient(10, 3));
        // Delen door 0: ArithmeticException, programma stopt
         System.out.println(quotient(10, 0));
        // Weer geen probleem?
         System.out.println(quotient(6, 2));
    }
}
