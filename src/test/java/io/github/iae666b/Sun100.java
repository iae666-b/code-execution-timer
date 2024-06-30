package io.github.iae666b;

public class Sun100 extends Algorithm {
    public void execute() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sun100=" + sum);
    }
}
