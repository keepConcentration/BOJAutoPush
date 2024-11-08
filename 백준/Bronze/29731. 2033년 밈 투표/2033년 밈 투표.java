import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"Never gonna give you up",
                        "Never gonna let you down",
                        "Never gonna run around and desert you",
                        "Never gonna make you cry",
                        "Never gonna say goodbye",
                        "Never gonna tell a lie and hurt you",
                        "Never gonna stop"};

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String str = br.readLine();
            if (!Arrays.stream(arr)
                    .filter(s -> s.equals(str))
                    .findFirst()
                    .isPresent()) {
                sb.append("Yes\n");
                break;
            }
        }
        if (sb.length() == 0) {
            sb.append("No");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}