import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        for (int i = 0; i < a; ++i) {
            sb.append("SciComLove\n");
        }
        System.out.println(sb.toString());
    }
}