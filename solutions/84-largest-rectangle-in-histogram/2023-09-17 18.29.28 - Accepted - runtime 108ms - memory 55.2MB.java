import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] ps = prevSmaller(heights);
        int[] ns = nextSmaller(heights);
        for (int i = 0; i < heights.length; i++) {
            int width = ns[i] - ps[i] - 1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    private int[] prevSmaller(int[] heights) {
        int[] ps = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = stack.peek();
            }
            stack.push(i);
        }
        return ps;
    }

    private int[] nextSmaller(int[] heights) {
        int[] ns = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ns[i] = heights.length;
            } else {
                ns[i] = stack.peek();
            }
            stack.push(i);
        }
        return ns;
    }
}
