import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = sc.nextInt(); i > 0; --i) {
            for (int j = i; j > 0; --j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}