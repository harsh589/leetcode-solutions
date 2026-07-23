class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int[] currRow = new int[matrix[0].length];
        int maxAns = maxHistogram(currRow);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    currRow[j] += 1;
                } else {
                    currRow[j] = 0;
                }
            }

            int currAns = maxHistogram(currRow);
            maxAns = Math.max(maxAns, currAns);
        }

        return maxAns;
    }

    private int maxHistogram(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? -1 : stack.peek();
                maxArea = Math.max(maxArea, h * (i - w - 1));
            }
            stack.push(i);
        }

        return maxArea;
    }
}
