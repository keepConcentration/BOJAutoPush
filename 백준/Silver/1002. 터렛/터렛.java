import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int loop = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loop; ++i) {
            String[] param = br.readLine().split(" ");
            
            int x1 = Integer.parseInt(param[0]);
            int y1 = Integer.parseInt(param[1]);
            int r1 = Integer.parseInt(param[2]);
            int x2 = Integer.parseInt(param[3]);
            int y2 = Integer.parseInt(param[4]);
            int r2 = Integer.parseInt(param[5]);
            
            // 두 점 사이의 거리
            BigDecimal r3 = new BigDecimal(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
            
            // 접점 무한일 경우
            if (x1 == x2 && y1 == y2 && r1 == r2 && r3.compareTo(BigDecimal.ZERO) == 0) {
                sb.append("-1\n");
                continue;
            }
            // 외접할 경우 (접점 1개)
            if (r3.compareTo(new BigDecimal(r1 + r2)) == 0) {
                sb.append("1\n");
                continue;
            }
            // 내접할 경우 (접점 1개)
            if (r3.compareTo(new BigDecimal(Math.abs(r1 - r2))) == 0) {
                sb.append("1\n");
                continue;
            }
            // 동심원 (접점 0개)
            if (r3.compareTo(BigDecimal.ZERO) == 0 && r1 != r2) {
                sb.append("0\n");
                continue;
            }
            // 원 안에 원 (접점 0개)
            if (r3.compareTo(new BigDecimal(Math.abs(r1 - r2))) == -1) {
                sb.append("0\n");
                continue;
            }
            // 원 밖에 원 (접점 0개)
            if (r3.compareTo(new BigDecimal(r1 + r2)) == 1) {
                sb.append("0\n");
                continue;
            }
            sb.append("2\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}