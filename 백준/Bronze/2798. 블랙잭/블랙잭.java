import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int card = sc.nextInt();
        int[] cardList = new int[card];
        int result = 0;
        int max = sc.nextInt();
        for (int i = 0; i < cardList.length; ++i) {
            cardList[i] = sc.nextInt();
        }
        for (int i = 0; i < cardList.length - 2; ++i) {
            for (int j = i + 1; j < cardList.length - 1; ++j) {
                for (int k = j + 1; k < cardList.length; ++k) {
                    int add = cardList[i] + cardList[j] + cardList[k];
                    if (result < add && add <= max) {
                        result = add;
                    }
                }
            }
        }
        System.out.println(result);
    }
}