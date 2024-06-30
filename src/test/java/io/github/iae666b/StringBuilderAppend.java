package io.github.iae666b;

@SuppressWarnings({"all"})
public class StringBuilderAppend extends Algorithm {
    int count;

    public StringBuilderAppend(int count) {
        this.count = count;
    }

    @Override
    public void execute() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(i);
        }
    }
}
