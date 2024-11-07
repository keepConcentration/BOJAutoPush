import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Comparator<String> c = new StringComparator();
        
        int loop = Integer.parseInt(br.readLine());
        
        String[] arr = new String[loop];
        
        for (int i = 0; i < loop; ++i) {
            arr[i] = br.readLine();
        }
        
        br.close();
        
        Arrays.sort(arr, c);
        
        sb.append(arr[0]);
        sb.append("\n");
        
        for (int i = 1; i < loop; ++i) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]);
                sb.append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (a.length() < b.length()) {
            return -1;
        }
        if (a.length() == b.length()) {
            return a.compareTo(b);
        }
        return 1;
    }
}