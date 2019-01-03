package org.sla;

public class Main {

    public static void main(String[] args) {
        int sequence = 2;

        System.out.println("The computer will compute " + sequence + " sequences of the Fibonacci sequence");
        System.out.println("");

        // Let's compute the fibonacci sequence
        for (int i = 0; i < sequence; i++) {
            Fibonacci fibonacci = new Fibonacci((int)(Math.random()*100), 5, 7);
            Thread thread = new Thread(fibonacci);
            thread.start();
        }

        System.out.println("All sequences were computed successfully!");
    }
}