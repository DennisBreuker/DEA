package nl.han.oose.dea.lesson4;

public class ThrowAnException3 {

    public static int quotient(int teller, int deler) {
        /*
         * Controle:
         * IllegalArgument is ook een keuze
         */
        if (deler == 0) {
            throw new IllegalArgumentException("Delen door 0 niet toegestaan");
        }
        return teller / deler;
    }

    public static void main(String[] args) {
        // geen probleem
        System.out.println(quotient(10, 3));
        // Embed risico code in try-catch
        try {
            // Delen door 0
            System.out.println(quotient(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Programma gaat nu door, want Exception is afgevangen
        System.out.println(quotient(6, 2));

    }
}
