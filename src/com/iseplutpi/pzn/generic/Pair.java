package com.iseplutpi.pzn.generic;

public class Pair<T, U> {
    private T frist;
    private U second;

    public void setFrist(T frist) {
        this.frist = frist;
    }

    public T getFrist() {
        return frist;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public Pair(T frist, U second) {
        this.frist = frist;
        this.second = second;
    }
}
