class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int n :nums){
             if (n >= 0) pos.add(n);
            else  neg.add(n);
        }

        int[] result = new int[nums.length];
        for(int i=0;i<pos.size();i++){
            result[2*i] = pos.get(i);
            result[2*i+1] = neg.get(i);
        }

        return result;
    }
}