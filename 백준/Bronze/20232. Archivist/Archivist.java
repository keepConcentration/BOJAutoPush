import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = "ITMO";
        switch (a) {
            case 1996:
            case 1997:
            case 2000:
            case 2007:
            case 2008:
            case 2013: 
            case 2018: result = "SPbSU"; break;
            case 2006: result = "PetrSU, ITMO"; break;
        }
        System.out.println(result);
    }
}