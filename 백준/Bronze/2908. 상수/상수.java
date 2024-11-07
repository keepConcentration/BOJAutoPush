import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String param1 = sc.next();
        String param2 = sc.next();
        System.out.print(Math.max(Integer.parseInt(param1.substring(2, 3) + param1.substring(1, 2) + param1.substring(0, 1)), Integer.parseInt(param2.substring(2, 3) + param2.substring(1, 2) + param2.substring(0, 1))));
    }
}