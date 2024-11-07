import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr;
        int n = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            arr = br.readLine().split(" ");
            if ("leave".equals(arr[1])) {
                map.remove(arr[0]);
            } else {
                map.put(arr[0], true);
            }
        }
        List<String> list = map.keySet().stream().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        list.stream().forEach(str -> sb.append(str).append("\n"));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
