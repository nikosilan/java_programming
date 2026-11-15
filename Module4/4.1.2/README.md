# Calculator

## Program idea

This Java class is a simple calculator that keeps a running total. You can reset the total, add a non-negative number to it, and check its current value.

## Calculator class

```java
public class Calculator {
    private int value;

    public void reset() {
        value = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must not be negative.");
        }
        value += number;
    }

    public int getValue() {
        return value;
    }
}
```

## How it works

The `Calculator` class stores its current total in the private field `value`. Because the field is private, other classes use the calculator's methods to change or read the total.

- `reset()` sets the total to `0`.
- `add(int number)` adds the given number to the total. Negative numbers are not allowed; if one is provided, the method throws an `IllegalArgumentException` and leaves the total unchanged.
- `getValue()` returns the current total without changing it.

The class does not display anything by itself. A program can call these methods and decide how to use or show the returned value.
