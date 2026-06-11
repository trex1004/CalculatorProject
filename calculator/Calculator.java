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


    private static ArrayList<Integer> record = new ArrayList<>();

    public void getRecord() {
        System.out.println("목록\n" + record);
    }
}