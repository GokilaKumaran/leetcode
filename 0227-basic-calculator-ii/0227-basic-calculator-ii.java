class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        int currentNum = 0;
        char lastOperator = '+';
        int n = s.length();
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            }

            // If current char is operator or last char of string, process
            if ((!Character.isDigit(c) && c != ' ') || i == n - 1) {
                if (lastOperator == '+') {
                    stack.push(currentNum);
                } else if (lastOperator == '-') {
                    stack.push(-currentNum);
                } else if (lastOperator == '*') {
                    stack.push(stack.pop() * currentNum);
                } else if (lastOperator == '/') {
                    int top = stack.pop();
                    // truncate towards zero division
                    stack.push(top / currentNum);
                }
                lastOperator = c;
                currentNum = 0;
            }
        }

        int result = 0;
        for (int num : stack) {
            result += num;
        }

        return result;
    }
}