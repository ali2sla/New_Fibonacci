package org.sla;

public class Main {

    public static void main(String[] args) {
        boolean recursiveMode = true;
        int sequence = 5;

        System.out.println("The computer will compute " + sequence + " sequences of the Fibonacci sequence in" + (recursiveMode ? " recursively." : " iteratively."));
        System.out.println("");

        // Let's computer the fibonacci sequence
        for (int i = 0; i < sequence; i++) {
            Fibonacci fibonacci = new Fibonacci(0, 0, 1);
            fibonacci.run();

            // DON'T continue launching more rockets until this rocket is launched
            if (!fibonacci.launched()) {
                System.out.println("ERROR: skipping current sequence!");
            }
        }

        System.out.println("All sequences were computed successfully!");
    }
}