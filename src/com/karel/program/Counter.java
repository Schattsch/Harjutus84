package com.karel.program;

public class Counter {
    private int value;
    private final boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, true); // make check false if you want it to be below 0!
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            value += increaseAmount;
        }
    }

    public void decrease() {
        if (check && value > 0) {
            value--;
        } else if (!check) {
            value--;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check && value - decreaseAmount >= 0) {
                value -= decreaseAmount;
            } else if (!check) {
                value -= decreaseAmount;
            }
        }
    }
}


