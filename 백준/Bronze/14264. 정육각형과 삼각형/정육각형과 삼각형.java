import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        double L1 = Math.sqrt(Math.pow(2*L, 2) - Math.pow(L, 2));
        double a = L * L1 / 2;
        double b = ((Math.sqrt(3) * 3 * Math.pow(L, 2) / 2) - a * 2) / 2;

        System.out.println(a < b ? a : b);
        
    }
}