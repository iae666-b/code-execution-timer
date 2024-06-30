package io.github.iae666b;

public class ExecutionTimer {
    /**
     * Returns the execution time of algorithms in milliseconds.
     *
     * @param algorithm the specific algorithm
     * @return execution time of algorithms in milliseconds
     */
    public static long calculate(Algorithm algorithm) {
        long start = System.currentTimeMillis();
        algorithm.execute();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
