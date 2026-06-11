package calculator;

import java.util.ArrayList;

public class Calculator {
    public int calculate(int a, int b, char operator) {
        int result = 0;

        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
        }
        record.add(result);
        return result;
    }

    //    private static int record = 0;
    ArrayList<Integer> record = new ArrayList<>();
}