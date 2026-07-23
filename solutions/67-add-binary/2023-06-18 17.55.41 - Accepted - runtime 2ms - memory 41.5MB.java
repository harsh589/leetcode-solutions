class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result =new StringBuilder();
        int carry =0;
        int i = a.length()-1;
        int j =b.length()-1;


        while(i>=0||j>=0 || carry >0){
             int numA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
        int numB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;
        int sum = numA + numB + carry;
        int digit = sum % 2;
        carry = sum / 2;
        result.insert(0, digit);
        i--;
        j--;
    }

    return result.toString();
}
}