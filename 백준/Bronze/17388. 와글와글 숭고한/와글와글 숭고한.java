import java.util.Scanner;

interface Main {
    
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[3];
        
        for (int i = 0; i < 3; ++i) {
            a[i] = sc.nextInt();
        }
        
        if (a[0] + a[1] + a[2] >= 100) {
            System.out.println("OK");
        } else {
            String camp = "Soongsil";
            int temp = a[0];
            for (int i = 0; i < 3; ++i) {
                if (temp > a[i]) {
                    temp = a[i];
                    
                    if (i == 1) {
                        camp = "Korea";
                    } else if (i == 2) {
                        camp = "Hanyang";
                    }
                }
            }
            System.out.println(camp);
        }
    }
}