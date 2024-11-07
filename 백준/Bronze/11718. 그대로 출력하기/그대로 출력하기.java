import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        while (sc.hasNext()) {
            result += sc.nextLine() + "\n";
            
        }
        System.out.println(result);
    }
}