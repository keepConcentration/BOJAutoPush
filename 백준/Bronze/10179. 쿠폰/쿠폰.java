import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int loop = sc.nextInt();
        String result = "";
        
        for (int i = 0; i < loop; ++i) {
            double nmlAmt = sc.nextDouble();
            result += "$" + String.format("%.2f", Math.round(nmlAmt * 4 / 5 * 100) / 100.0) + "\n";
        }
        System.out.print(result);
    }
}