package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> throw new RuntimeException("연산자가 아닙니다.");

        }
        record.add(result);
        return result;
    }


    private List<Integer> record = new ArrayList<>(); //유연한 기록공유를 위해static제거와 List인터페이스로 로변경


    public List<Integer> getRecord() { // 게터 메서드에서 출력까지 X
        return this.record;
    }

    public void setRecord(List<Integer> record) {
        this.record = record;
    }

    public void removeRecord() { //세터메서드에서 삭제기능 제거
        record.remove(0);
    }
}