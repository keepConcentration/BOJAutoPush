import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; ++i) {
            int sh = sc.nextInt();
            int sm = sc.nextInt();
            int ss = sc.nextInt();
            
            int eh = sc.nextInt();
            int em = sc.nextInt();
            int es = sc.nextInt();
            
            int rh = 0;
            int rm = 0;
            int rs = 0;
            
            rs = es - ss;
            if (rs < 0) {
                rs += 60;
                rm -= 1;
            }
            rm += em - sm;
            if (rm < 0) {
                rm += 60;
                rh -= 1;
            }
            rh += eh - sh;
            result.append(rh + " ");
            result.append(rm + " ");
            result.append(rs + "\n");
        }
        
        System.out.print(result.toString());
    }
}