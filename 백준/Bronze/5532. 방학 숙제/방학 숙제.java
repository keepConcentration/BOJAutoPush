import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vacation = sc.nextInt();
        double totKorean = sc.nextDouble();
        double totMath = sc.nextDouble();
        
        int totDayKorean = (int)Math.ceil(totKorean / sc.nextDouble());
        int totDayMath = (int)Math.ceil(totMath / sc.nextDouble());
        
        int result = 0;
        
        result = vacation - (totDayKorean < totDayMath ? totDayMath : totDayKorean);
        
        System.out.println(result);
    }
}