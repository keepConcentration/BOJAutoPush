import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        int inputCnt = Integer.parseInt(br.readLine());
        
        int qStartIdx = 0;
        int qLastIdx = 0;
        int[] q = new int[10001];
        
        for (int i = 0; i < inputCnt; ++i) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push" :
                    q[qLastIdx] = Integer.parseInt(input[1]);
                    qLastIdx++;
                    break;
                case "pop" :
                    if (qStartIdx == qLastIdx) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q[qStartIdx]).append("\n");
                        qStartIdx++;
                    }
                    break;
                case "size" :
                    sb.append(qLastIdx - qStartIdx).append("\n");
                    break;
                case "empty" :
                    if (qStartIdx == qLastIdx) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front" :
                    if (qStartIdx == qLastIdx) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q[qStartIdx]).append("\n");
                    }
                    break;
                case "back" :
                    if (qStartIdx == qLastIdx) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q[qLastIdx - 1]).append("\n");
                    }
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}