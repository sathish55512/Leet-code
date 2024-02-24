class Solution {
    public int calculate(String s) {
        int num = 0;
        char operator = '+';
        int last = 0, sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if (isOperator(c) || i == s.length() - 1) {
                if (operator == '+') {
                    sum += last;
                    last = num;
                }
                else if (operator == '-') {
                    sum += last;
                    last = -num;
                }
                else if (operator == '*') last *= num;
                else if (operator == '/') last /= num;

                num = 0;
                operator = c;
            }
        }

        return sum += last;
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}