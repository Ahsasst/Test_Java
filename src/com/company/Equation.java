package com.company;
import java.util.Stack;

public class Equation {
    private final String OPERATORS = "+-*/=";

    public boolean validateBrackets(String equation) {
        Stack<Character> stack = new Stack<>();

        for (char ch : equation.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean validateExpression(String equation) {
        for (int i = 0; i < equation.length() - 1; i++) {
            char currentChar = equation.charAt(i);
            char nextChar = equation.charAt(i + 1);

            if (OPERATORS.contains(String.valueOf(currentChar))) {
                if (OPERATORS.contains(String.valueOf(nextChar)) && nextChar != '-') {
                    return false;
                }
            }
        }

        return true;
    }

    public int countNumbers(String equation) {
        int count = 0;
        boolean isNumber = false;

        for (int i = 0; i < equation.length(); i++) {
            char ch = equation.charAt(i);

            if (Character.isDigit(ch) || ch == '.' || ch == ',') {
                if (!isNumber) {
                    count++;
                    isNumber = true;
                }
            } else {
                isNumber = false;
            }
        }

        return count;
    }
}
