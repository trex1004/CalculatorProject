package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        int result = 0;


        while (true) {
            System.out.println("첫번째 숫자를 입력하세요.");
            int a = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요.");
            int b = sc.nextInt();
            System.out.println("연산자를 입력하세요.");
            char operator = sc.next().charAt(0);

            result = cal.calculate(a, b, operator);
            System.out.println("결과: " + result);

            cal.getRecord();

            System.out.println("더 계산하시겠습니까? (종료: exit)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                return;
            }

        }
    }

}