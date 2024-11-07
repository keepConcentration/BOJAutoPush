import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; ++i) {
            int round = Integer.parseInt(br.readLine());
            int player1WinCount = 0;
            int player2WinCount = 0;
            for (int j = 0; j < round; ++j) {
                String[] rps = br.readLine().split(" ");
                if (rps[0].equals("R") && rps[1].equals("S")
                || rps[0].equals("S") && rps[1].equals("P")
                || rps[0].equals("P") && rps[1].equals("R")) {
                    player1WinCount++;
                } else if (rps[0].equals("R") && rps[1].equals("P")
                        || rps[0].equals("P") && rps[1].equals("S")
                        || rps[0].equals("S") && rps[1].equals("R")) {
                    player2WinCount++;
                }
            }
            if (player1WinCount > player2WinCount) {
                bw.write("Player 1\n");
            } else if (player1WinCount < player2WinCount) {
                bw.write("Player 2\n");
            } else {
                bw.write("TIE\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}