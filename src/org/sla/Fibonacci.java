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
        System.out.println(start1);
        System.out.println(start2);
        for (int i = 2; i < amount; i = i + 1) {
            int sum = start1 + start2;
            System.out.println(sum);

            start1 = start2;
            start2 = sum;
        }
    }

    public void run() {
        System.out.println("Sequence will be computed.");
        writeString();
    }
}
