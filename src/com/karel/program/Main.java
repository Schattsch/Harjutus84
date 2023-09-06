package com.karel.program;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(5, true);
        Counter counter2 = new Counter(10);
        Counter counter3 = new Counter();

        System.out.println("Counter 1 BEFORE increase: " + counter1.value());
        System.out.println("Counter 2 BEFORE decrease: " + counter2.value());
        System.out.println("Counter 3 BEFORE decrease: " + counter3.value());

        counter1.increase();
        counter2.decrease();
        counter3.decrease();

        System.out.println("Counter 1 AFTER increase: " + counter1.value());
        System.out.println("Counter 2 AFTER decrease: " + counter2.value());
        System.out.println("Counter 3 AFTER decrease: " + counter3.value());
    }
}
