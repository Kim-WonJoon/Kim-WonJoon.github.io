package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit;


        do {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.println("연산기호를 입력하세요: ");
            String calSymbol = sc.next();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();


            System.out.print(num1 + calSymbol + num2 + " = ");
            switch (calSymbol) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다");
                    } else {
                        System.out.println(num1 / num2 + "..." + num1 % num2);
                    } break;
                    default:
                        System.out.println("잘못된 연산기호");
            }
            System.out.println("아무키나 입력하여 다시 계산.(종료하려면 'exit'입력)");
            exit = sc.next();

        } while (!exit.equals("exit"));
        System.out.println("종료");


    }
}

