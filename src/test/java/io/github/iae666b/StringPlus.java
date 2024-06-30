package io.github.iae666b;

@SuppressWarnings({"all"})
public class StringPlus extends Algorithm {
    int count;

    public StringPlus(int count) {
        this.count = count;
    }

    @Override
    public void execute() {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i;
        }
    }
}
