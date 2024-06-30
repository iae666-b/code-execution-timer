package io.github.iae666b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecutionTimerTest {

    @Test
    void calculate() {
        int[] counts = new int[] {10, 1000, 10000};
        for (int count : counts) {
            long t1 = ExecutionTimer.calculate(new StringPlus(count));
            long t2 = ExecutionTimer.calculate(new StringBuilderAppend(count));
            assertTrue(t2 < t1);
        }
    }
}