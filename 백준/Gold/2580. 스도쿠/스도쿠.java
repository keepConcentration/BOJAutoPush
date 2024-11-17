import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static StringBuilder sb = new StringBuilder();

  static int[][] map = new int[9][9];
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 9; ++i) {
      String[] strArr = br.readLine().split(" ");
      for (int j = 0; j < 9; ++j) {
        map[i][j] = parseInt(strArr[j]);
      }
    }
    br.close();

    sudoku(0, 0);
  }

  private static boolean isPossible(int y, int x, int num) {
    for (int i = 0; i < 9; ++i) {
      if (map[y][i] == num) {
        return false;
      }
      if (map[i][x] == num) {
        return false;
      }
    }

    int yMin = y / 3 * 3;
    int yMax = yMin + 2;
    int xMin = x / 3 * 3;
    int xMax = xMin + 2;

    for (int i = yMin; i <= yMax; ++i) {
      for (int j = xMin; j <= xMax; ++j) {
        if (map[i][j] == num) {
          return false;
        }
      }
    }
    return true;
  }

  private static void sudoku(int y, int x) throws IOException {
    if (x == 9) {
      sudoku(y + 1, 0);
      return;
    }

    if (y == 9) {
      for (int i = 0; i < 9; ++i) {
        for (int j = 0; j < 9; ++j) {
          sb.append(map[i][j]).append(" ");
        }
        sb.append("\n");
      }
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      bw.write(sb.toString());
      bw.flush();
      bw.close();
      System.exit(0);
    }

    if (map[y][x] == 0) {
      for (int i = 1; i <= 9; ++i) {
        if (isPossible(y, x, i)) {
          map[y][x] = i;
          sudoku(y, x + 1);
        }
      }
      map[y][x] = 0;
      return;
    }
    sudoku(y, x + 1);
  }
}
