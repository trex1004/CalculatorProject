package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        int result = 0;


        while (true) {
            try {

                System.out.println("첫번째 정수를 입력하세요.");
                int a = sc.nextInt();
                System.out.println("두번째 정수를 입력하세요.");
                int b = sc.nextInt();
                System.out.println("연산자를 입력하세요.");
                char operator = sc.next().charAt(0);

                result = cal.calculate(a, b, operator);
                System.out.println("결과: " + result);

                System.out.println("결과 목록 조회\n" + cal.getRecord()); //결과 목록 조회

                가


            } catch (InputMismatchException e) { //정수 입력에 문자나 실수 입력했을때 예외처리
                System.out.println("정수를 입력하세요");
                sc.nextLine();
            } catch (ArithmeticException e) { // 수학적 오류 예외처리
                System.out.println("0으로 나누기 불가능합니다.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

