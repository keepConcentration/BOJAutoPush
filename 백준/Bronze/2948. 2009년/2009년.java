import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        br.close();
        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        int totalD = 0;
        for (int i = 0; i < m; ++i) {
            totalD += days[i];
        }
        totalD += d;

        sb.append(get(totalD));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static String get(int day) {
        int d = day % 7;
        switch (d) {
            case 1: return "Thursday";
            case 2: return "Friday";
            case 3: return "Saturday";
            case 4: return "Sunday";
            case 5: return "Monday";
            case 6: return "Tuesday";
        }
        return "Wednesday";
    }
}
