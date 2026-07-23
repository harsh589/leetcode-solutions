class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Step 2: buckets banao
        // bucket[i] = wo chars jinki frequency = i
        List<Character>[] bucket = new List[s.length() + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // Step 3: har char ko uske bucket mein daalo
        for (int c = 0; c < 128; c++) {
            if (freq[c] > 0) {
                bucket[freq[c]].add((char) c);
            }
        }

        // Step 4: end se traverse karo → result build karo
        StringBuilder result = new StringBuilder();
        for (int i = bucket.length - 1; i >= 1; i--) {
            for (char c : bucket[i]) {
                for (int j = 0; j < i; j++) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
