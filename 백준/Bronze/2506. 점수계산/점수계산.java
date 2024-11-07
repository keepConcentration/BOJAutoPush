import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		
		int count = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				count++;
				sum += count;
				//연속된 수 체크하면서 연속될 경우
				//count를 하나씩 더해주어
				//sum에 더해준다.
			}else {
				count = 0;
				//연속된값 체크시 후 연속되지 않을 경우
				//0으로 초기화 하여 검색한다.
			}
			
		}
		
		System.out.println(sum);
    }
}