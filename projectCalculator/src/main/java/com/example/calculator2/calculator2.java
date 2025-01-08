package com.example.calculator2;

import java.util.LinkedList;
import java.util.Queue;

public class calculator2 {
    //  필드
    private Queue<Integer> results;
    private static final int maxResult = 3; // 최대 저장 개수

    // 생성자
    public calculator2() {
        results = new LinkedList<>();
    }


    public int calculate(int num1, int num2, char symbol) {
        int result = 0;

        switch (symbol) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                break;
            default:
                System.out.println("잘못된 연산기호입니다.");
                return 0;
        }

        results.add(result);

        if (results.size() > maxResult) {
            results.poll();
        }

        return result;
    }

    public Queue<Integer> getResults() {
        return new LinkedList<>(results);
    }
}
