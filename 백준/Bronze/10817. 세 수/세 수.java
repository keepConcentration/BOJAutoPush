import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> paramList = new ArrayList<Integer>(3);
        
        paramList.add(sc.nextInt());
        paramList.add(sc.nextInt());
        paramList.add(sc.nextInt());
        
        Collections.sort(paramList);
        
        System.out.print(paramList.get(1));
    }
}