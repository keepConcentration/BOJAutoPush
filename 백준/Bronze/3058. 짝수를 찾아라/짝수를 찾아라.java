import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < loop; ++i) {
            int min = Integer.MAX_VALUE;
            int sum = 0;
            String[] params = br.readLine().split(" ");
            for (int j = 0; j < params.length; ++j) {
                int num = Integer.parseInt(params[j]);
                if (num % 2 == 0) {
                    if (num < min) {
                        min = num;
                    }
                    sum += num;
                }
            }
            result += sum + " " + min + "\n";
        }
        System.out.print(result);
    }
}