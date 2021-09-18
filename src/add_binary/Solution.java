package add_binary;

public class Solution {
    public static void main(String[] args){
        String a = "10001001";
        String b = "111010";
        System.out.println(addBinary(a, b));
    }

    private static String addBinary(String a, String b){
        int additional = 0;
        String s = a.length() > b.length() ? b : a;
        String l = a.length() > b.length() ? a : b;
        StringBuilder temp = new StringBuilder(l);
        for(int i = 1; i <= l.length(); i++){
            int shortValue = 48;
            if(i <= s.length())
                shortValue = s.charAt(s.length() - i);

            int sum = shortValue + (int)l.charAt(l.length() - i) - 96;
            if(sum + additional < 2){
                temp.setCharAt(temp.length() - i, (char)(sum + additional + 48));
                additional = 0;
            } else {
                temp.setCharAt(temp.length() - i, (char)(sum + additional + 46));
                additional = 1;
            }
        }

        String ans = temp.toString();

        if(additional != 0){
            ans = "1" + ans;
        }

        return ans;
    }
}
