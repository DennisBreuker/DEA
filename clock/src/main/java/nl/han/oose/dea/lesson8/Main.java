package nl.han.oose.dea.lesson8;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.addObserver(new TwelveHour());
        clock.addObserver(new TwentyFourHour());

        new Thread(clock).start();

//        for (int i=0; i<10 ;i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            clock.incSecond();
//        }
    }

}
