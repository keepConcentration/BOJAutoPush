import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String param = new Scanner(System.in).next().toUpperCase();
        char result = '?';
        int[] counts = new int[26];
        int max = -1;
        for (int i = 0; i < param.length(); ++i) {
            ++counts[param.charAt(i)-65];
        }
        for (int i = 0; i < 26; ++i) {
            if (counts[i] > max) {
                result = (char)(i+65);
                max = counts[i];
            } else if (counts[i] == max) {
                result = '?';
            }
        }
        System.out.print(result);
    }
}