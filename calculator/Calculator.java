package calculator;

public class Calculator {

    public int calculate(int a, int b, char operator) {
        int result = 0;

        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
        }
        return result;
    }
}