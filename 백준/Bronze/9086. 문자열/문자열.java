import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        String result = "";
        for (int i = 0; i < cnt; ++i) {
            String input = sc.next();
            result += String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(input.length() - 1));
            result += "\n";
        }
        System.out.print(result);
    }
}