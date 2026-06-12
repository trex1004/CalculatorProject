package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            try {

                System.out.println("첫번째 정수를 입력하세요.");
                int num1 = sc.nextInt();
                System.out.println("두번째 정수를 입력하세요.");
                int num2 = sc.nextInt();
                System.out.println("연산자를 입력하세요.");
                char operator = sc.next().charAt(0);

                int result = cal.calculate(num1, num2, operator);
                System.out.println("결과: " + result);

                System.out.println("결과 목록 조회\n" + cal.getRecord()); //결과 목록 조회

                System.out.println("더 계산 하시겠습니까?\n(종료: exit) / (첫 결과 삭제: 1)/(계속하려면 아무키)");
                String exit = sc.next();
                if (exit.equals("exit")) {
                    return;
                } else if (exit.equals("1")) {
                    cal.removeRecord();
                }


            } catch (InputMismatchException e) { //정수 입력에 문자나 실수 입력했을때 예외처리
                System.out.println("정수를 입력하세요");
                sc.nextLine();
            } catch (ArithmeticException e) { // 수학적 오류 예외처리
                System.out.println("0으로 나누기 불가능합니다.");
                sc.nextLine();
            } catch (Exception e) { //연산자가 아닐때 예외처리
                System.out.println(e.getMessage());
            }
        }
    }
}

