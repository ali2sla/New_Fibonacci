package org.sla;

class Fibonacci implements Runnable {
    private int start1;
    private int start2;
    private int amount;
    private boolean launched;

    private boolean recursiveMode;

    Fibonacci (int a, int b, int c) {
    a = b;
    b = c;
    c = a + b;



    }

    boolean launched() {
        return launched;
    }

    /*private void countdownIterative() {
        for (int i = launchTime; i > 0; i--) {
            System.out.println("Sequence " + id + " is " + i + ".");
            try {
                // wait 1 second (which is same as 1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        canLaunch = true;*/
    }

    /*private void countdownRecursive(int count) {
        if (count > 0) {
            System.out.println("Rocket " + id + " launching in " + count + " seconds.");
            try {
                // wait 1 second (which is same as 1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            countdownRecursive(count - 1);
        } else {
            canLaunch = true;
        }
    }*/

    public void run() {
        System.out.println("Sequence will be computed.");
        /*if (recursiveMode) {
            countdownRecursive(launchTime);
        } else {
            countdownIterative();
        }
        launch();*/
    }
}