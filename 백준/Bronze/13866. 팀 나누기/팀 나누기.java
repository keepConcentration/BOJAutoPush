import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        
        int min = a;
        int max = a;
        
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        
        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;
        
        int result = Math.abs(max + min - (a+b+c+d-max-min));
        System.out.println(result);
        
    }
}