import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int inputVal = 0;
		StringBuilder results = new StringBuilder();
		while ((inputVal = s.nextInt()) != 0) {
			int from = inputVal;
			int to = inputVal * 2;
			boolean[] result = new boolean[to + 1];
			if (to < 2) {
				continue;
			}
			if (to == 2) {
				results.append("1\n");
				continue;
			}
			if (from < 2) {
				from = 2;
			}
			if (from == 2) {
				result[2] = true;
			}
			int resultCnt = 0;
			for (int j = from + 1; j <= to; ++j) {
				boolean result1 = true;
				for (int i = (int)Math.sqrt(j); i > 1; --i) {
					if (j % i == 0) {
						result1 = false;
						break;
					}
				}
				result[j] = result1;
				if (result1) {
					resultCnt++;
				}
			}
			
			results.append(resultCnt + "\n");
		}
		System.out.print(results);
		s.close();
    }
}