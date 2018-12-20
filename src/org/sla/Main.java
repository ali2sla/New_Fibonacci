package org.sla;

public class Main {

    public static void main(String[] args) {
        boolean recursiveMode = true;
        int sequence = 2;

        System.out.println("The computer will compute " + sequence + " sequences of the Fibonacci sequence in" + (recursiveMode ? " recursively." : " iteratively."));
        System.out.println("");

        // Let's compute the fibonacci sequence
        for (int i = 0; i < sequence; i++) {
            Fibonacci fibonacci = new Fibonacci(2, 5, 7);
            fibonacci.run();
        }

        System.out.println("All sequences were computed successfully!");
    }
}