import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        String result = "Special";
        if (M < 2) {
            result = "Before";
        } else if (M > 2) {
            result = "After";
        } else {
            if (D < 18) {
                result = "Before";
            } else if (D > 18) {
                result = "After";
            }
        }
        System.out.println(result);
    }
}