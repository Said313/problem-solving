package integer_to_roman;

public class Solution {

    public static void main(String[] args) {
        int max = 3999;
        System.out.println("intToRoman(" + max + ") = " + intToRoman(max));
    }

    public static String intToRoman(int num) {
        int[] keys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] values = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; num != 0;) {
            if(keys[i] <= num) {
                num -= keys[i];
                sb.append(values[i]);
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
