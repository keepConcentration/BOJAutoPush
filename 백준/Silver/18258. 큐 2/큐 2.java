import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(br.readLine());
        int firstIdx = 0;
        int lastIdx = -1;
        int[] queue = new int[2_000_000];
        
        for (int i = 0; i < N; ++i) {
            String[] opers = br.readLine().split(" ");
            switch (opers[0]) {
                case "push":
                    queue[++lastIdx] = Integer.parseInt(opers[1]);
        
                    break;
                case "pop":
                    if (lastIdx < firstIdx) {
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(queue[firstIdx]).append("\n");
                    queue[firstIdx] = -1;
                    firstIdx++;
                    break;
                case "empty" :
                    if (lastIdx < firstIdx) {
                        sb.append("1\n");
                        break;
                    }
                    sb.append("0\n");
                    break;
                case "front" :
                    if (lastIdx < firstIdx) {
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(queue[firstIdx]).append("\n");
                    break;
                case "back" :
                    if (lastIdx < firstIdx) {
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(queue[lastIdx]).append("\n");
                    break;
                case "size" :
                    sb.append(lastIdx - firstIdx + 1).append("\n");
                    break;
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}