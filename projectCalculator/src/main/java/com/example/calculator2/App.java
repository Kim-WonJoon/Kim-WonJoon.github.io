package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        calculator2 calculator = new calculator2();
        Scanner sc = new Scanner(System.in);

        String exit = "";

        do {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char symbol = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();


            int result = calculator.calculate(num1, num2, symbol);
            System.out.println("결과: " + result);

            System.out.println("히스토리: " + calculator.getResults());


            System.out.print("아무키나 입력하여 다시계산? (exit 입력 시 종료): ");
            exit = sc.next();

        } while (!exit.equals("exit"));


        System.out.println("최종 저장된 연산 결과: " + calculator.getResults());

        sc.close();
    }
}
