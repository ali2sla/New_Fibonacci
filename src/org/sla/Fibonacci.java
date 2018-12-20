package org.sla;

class Fibonacci implements Runnable {
    private int start1;
    private int start2;
    private int amount;

    Fibonacci(int a, int b, int c) {
        start1 = a;
        start2 = b;
        amount = c;
    }

    private void writeString() {
        for (int i = 0; i < amount; i = i + 1) {
            int sum = start1 + start2;
            System.out.println(start1);
            System.out.println(start2);

            start1 = start2;
            start2 = sum;
            System.out.println(sum);
        }
    }

    public void run() {
        System.out.println("Sequence will be computed.");
        writeString();
    }
}
