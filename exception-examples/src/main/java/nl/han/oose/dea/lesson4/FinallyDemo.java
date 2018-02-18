package nl.han.oose.dea.lesson4;

public class FinallyDemo {

    public static void main(String[] args) {
        // Finally zonder exception
        System.out.println("Zonder Exception");
        try {
            System.out.println("\tRegel 1");
            System.out.println("\tRegel 2");
        } catch (Exception e) {
            System.out.println("\tCatch");
        } finally {
            System.out.println("\tFinally");
        }
        System.out.println();

        // Finally met exception
        System.out.println("Met exception");
        try {
            System.out.println("\tRegel 1");
            System.out.println("\tforceer exception");
            // forceer exception
            int i = 1/0;
            System.out.println("\tRegel 2");
        }  catch (Exception e) {
            System.out.println("\tCatch");
        }  finally {
            System.out.println("\tFinally");
        }
    }
}
