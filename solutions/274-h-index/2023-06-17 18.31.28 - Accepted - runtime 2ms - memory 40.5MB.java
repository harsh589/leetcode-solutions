import java.util.Arrays;

public class Solution {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;

        for (int i = 0; i < n; i++) {
            int count = n - i;
            if (citations[i] >= count) {
                hIndex = Math.max(hIndex, count);
            }
        }

        return hIndex;
    }
}