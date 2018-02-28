package nl.han.oose.dea.lesson8;

import java.util.Observable;

public class Clock extends Observable implements Runnable {
    private int hh;
    private int mm;
    private int ss;

    public Clock(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
        setChanged();
        notifyObservers();
    }

    public Clock() {
        this(11,59,55);
    }

    public void incSecond() {
        ss++;
        if (ss == 60) {
            ss = 0;
            mm++;
            if (mm == 60) {
                mm = 0;
                hh++;
                if (hh == 24) {
                    hh = 0;
                }
            }
        }
        setChanged();
        notifyObservers();
    }

    public int getHh() {
        return hh;
    }

    public int getMm() {
        return mm;
    }

    public int getSs() {
        return ss;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            incSecond();
        }
    }
}
