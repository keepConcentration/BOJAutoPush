import java.io.*;
import java.util.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    static boolean[][] visited;

    static int[][] island;
    static int maxX;
    static int maxY;

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String in;
        while (!(in = br.readLine()).equals("0 0")) {
            String[] arr = in.split(" ");
            result = 0;
            maxX = Integer.parseInt(arr[1]);
            maxY = Integer.parseInt(arr[0]);
            island = new int[maxX][maxY];
            visited = new boolean[maxX][maxY];

            for (int i = 0; i < maxX; ++i) {
                arr = br.readLine().split(" ");
                for (int j = 0; j < maxY; ++j) {
                    island[i][j] = Integer.parseInt(arr[j]);
                }
            }

            for (int i = 0; i < maxX; ++i) {
                for (int j = 0; j < maxY; ++j) {
                    bfs(i, j);
                }
            }
            sb.append(result).append("\n");
        }


        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void bfs(int x, int y) {
        if (visited[x][y]) {
            return;
        }
        if (island[x][y] == 0) {
            return;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int currentX = poll[0];
            int currentY = poll[1];

            if (!visited[currentX][currentY]) {
                result++;
                visited[currentX][currentY] = true;
                island[currentX][currentY] = 0;
            }

            if (currentX != 0 && currentY != 0) {
                if (!visited[currentX - 1][currentY - 1] && island[currentX - 1][currentY - 1] != 0) {
                    visited[currentX - 1][currentY - 1] = true;
                    island[currentX - 1][currentY - 1] = 0;
                    queue.add(new int[]{currentX - 1, currentY - 1});
                }
            }
            if (currentY != 0) {
                if (!visited[currentX][currentY - 1] && island[currentX][currentY - 1] != 0) {
                    visited[currentX][currentY - 1] = true;
                    island[currentX][currentY - 1] = 0;
                    queue.add(new int[]{currentX, currentY - 1});
                }
            }
            if (currentX != maxX - 1 && currentY != 0) {
                if (!visited[currentX + 1][currentY - 1] && island[currentX + 1][currentY - 1] != 0) {
                    visited[currentX + 1][currentY - 1] = true;
                    island[currentX + 1][currentY - 1] = 0;
                    queue.add(new int[]{currentX + 1, currentY - 1});
                }
            }
            if (currentX != maxX - 1) {
                if (!visited[currentX + 1][currentY] && island[currentX + 1][currentY] != 0) {
                    visited[currentX + 1][currentY] = true;
                    island[currentX + 1][currentY] = 0;
                    queue.add(new int[]{currentX + 1, currentY});
                }
            }
            if (currentX != maxX - 1 && currentY != maxY - 1) {
                if (!visited[currentX + 1][currentY + 1] && island[currentX + 1][currentY + 1] != 0) {
                    visited[currentX + 1][currentY + 1] = true;
                    island[currentX + 1][currentY + 1] = 0;
                    queue.add(new int[]{currentX + 1, currentY + 1});
                }
            }
            if (currentY != maxY - 1) {
                if (!visited[currentX][currentY + 1] && island[currentX][currentY + 1] != 0) {
                    visited[currentX][currentY + 1] = true;
                    island[currentX][currentY + 1] = 0;
                    queue.add(new int[]{currentX, currentY + 1});
                }
            }
            if (currentX != 0 && currentY != maxY - 1) {
                if (!visited[currentX - 1][currentY + 1] && island[currentX - 1][currentY + 1] != 0) {
                    visited[currentX - 1][currentY + 1] = true;
                    island[currentX - 1][currentY + 1] = 0;
                    queue.add(new int[]{currentX - 1, currentY + 1});
                }
            }
            if (currentX != 0) {
                if (!visited[currentX - 1][currentY] && island[currentX - 1][currentY] != 0) {
                    visited[currentX - 1][currentY] = true;
                    island[currentX - 1][currentY] = 0;
                    queue.add(new int[]{currentX - 1, currentY});
                }
            }
        }
    }
}