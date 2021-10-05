package rotational_cipher;

public class Solution {

    public static void main(String[] args) {
        String str = "Test124-4";
        Integer rf = 8;
        System.out.println("rotationalCipher(\"" + str + "\", " + rf + ") = " + rotationalCipher(str, rf));
    }

    static String rotationalCipher(String input, int rotationFactor) {
        char[] charArr = input.toCharArray();

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < charArr.length; ++i) {
            if((int)charArr[i] >= 65 && (int)charArr[i] <= 90) {
                ans.append((char)(((int)charArr[i] + rotationFactor - 65) % 26 + 65));
            } else if((int)charArr[i] >= 97 && (int)charArr[i] <= 122) {
                ans.append((char)(((int)charArr[i] + rotationFactor - 97) % 26 + 97));
            } else if((int)charArr[i] >= 48 && (int)charArr[i] <= 57) {
                ans.append((char)(((int)charArr[i] + rotationFactor - 48) % 10 + 48));
            } else {
                ans.append(charArr[i]);
            }
        }

        return ans.toString();
    }
}
