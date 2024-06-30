# Code Execution Timer

Code Execution Timer is a simple Java library designed to calculate the execution time of algorithms. It's primarily intended for use in teaching environments to demonstrate algorithm performance.

## Features

- Simple API to measure execution time
- Follow the Open-Closed Principle
- Review the core of OOP

## Installation

Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>io.github.iae666-b</groupId>
    <artifactId>code-execution-timer</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

Here's a quick example of how to use Code Run Timer:

### create new algorithm
```java
public class Sun100 extends Algorithm {
    public void execute() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sun100=" + sum);
    }
}
```

### calculate the elapsed time
```java
import io.github.iae666b.ExecutionTimer;

public class HowToUse {
    public static void main(String[] args) {
        ExecutionTimer.calculate(new Sun100());
    }
}
```

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.
