import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;

    static Integer[] dp;

    static int[] data = {1, 4, 10, 20, 35, 56, 84, 120, 165, 220, 286, 364, 455, 560, 680, 816, 969, 1140, 1330, 1540, 1771, 2024, 2300, 2600, 2925, 3276, 3654, 4060, 4495, 4960, 5456, 5984, 6545, 7140, 7770, 8436, 9139, 9880, 10660, 11480, 12341, 13244, 14190, 15180, 16215, 17296, 18424, 19600, 20825, 22100, 23426, 24804, 26235, 27720, 29260, 30856, 32509, 34220, 35990, 37820, 39711, 41664, 43680, 45760, 47905, 50116, 52394, 54740, 57155, 59640, 62196, 64824, 67525, 70300, 73150, 76076, 79079, 82160, 85320, 88560, 91881, 95284, 98770, 102340, 105995, 109736, 113564, 117480, 121485, 125580, 129766, 134044, 138415, 142880, 147440, 152096, 156849, 161700, 166650, 171700, 176851, 182104, 187460, 192920, 198485, 204156, 209934, 215820, 221815, 227920, 234136, 240464, 246905, 253460, 260130, 266916, 273819, 280840, 287980, 295240};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = 0;

        for (int d : data) {
            if (d > N) {
                break;
            }
            dp[d] = 1;
        }

        for (int i = 2; i <= N; ++i) {
            for (int j = 0; j < data.length; ++j) {
                if (i < data[j]) {
                    break;
                }
                if (dp[i] == null) {
// 놓을 수 있는 사면체형 대포 수(1)를 제외한 대포수 + 1 (i == 15일 경우 1개 제외한 14개를 놓는 사면체 개수 + 1)
                    dp[i] = dp[i - data[j]] + 1;
                } else {
// 놓을 수 있는 사면체형 대포 수(4, 10, 20 ... )를 제외한 대포수 + 1
                    // (i == 15일 경우 사면체인 4개를 제외한 '11개를 놓는 사면체 개수' + 1)
                    // (i == 15일 경우 사면체인 10개를 제외한 '5개를 놓는 사면체 개수' + 1)
                    dp[i] = Math.min(dp[i], dp[i - data[j]] + 1);
                }
            }
        }

        sb.append(dp[N]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int dp(int n) {
        if (dp[n] == null) {
            for (int i = 0; i < data.length; ++i) {
                if (n >= data[i]) {
                    if (dp[n] == null) {
                        dp[n] = dp(n - data[i]) + 1;
                    } else {
                        dp[n] = Math.min(dp[n], dp(n - data[i]) + 1);
                    }
                }
            }
        }
        return dp[n];
    }
}
