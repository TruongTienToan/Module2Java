package org.example.S4_LopVaDoiTuongTrongJava.StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private double start, stop;

    public StopWatch() {
        this.setStart();
        this.setStop();

    }

    public double getStart() {
        return start;
    }

    public void setStart() {
        this.start = System.currentTimeMillis();
    }

    public double getStop() {
        return stop;
    }

    public void setStop() {
        this.stop = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.getStop() - this.getStart();
    }
}
