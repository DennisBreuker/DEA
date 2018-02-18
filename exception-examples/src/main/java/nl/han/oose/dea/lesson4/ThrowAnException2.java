package nl.han.oose.dea.lesson4;

public class ThrowAnException2 {
    public static int quotient(int teller, int deler) {
        // Ccontrole op delen door 0
        if (deler == 0) {
            // gooi zelf een exception
            throw new ArithmeticException("Delen door 0 niet toegestaan");
        }
        return teller/ deler;
    } 

    public static void main(String[] args) {
        // geen probleem
        System.out.println(quotient(10, 3));
        // Delen door 0: onze gegooide Exception komt tevoorschijn
         System.out.println(quotient(10, 0));
        // Weer geen probleem?
         System.out.println(quotient(6, 2));
        
    }
}
