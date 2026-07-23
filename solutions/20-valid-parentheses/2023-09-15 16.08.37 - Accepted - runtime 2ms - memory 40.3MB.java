import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (isOpening(cur)) {
                stack.push(cur);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatching(stack.pop(), cur)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // Check if the stack is empty at the end
    }

    boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
}
