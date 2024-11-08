import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        String s2 = s.nextLine();

        char c = s1.charAt(0);

        if (c == 75 || c == 76) {
            System.out.println("BABA IS WIN");
        } else {
            System.out.println("BABA IS NOT WIN");
        }
    }
}