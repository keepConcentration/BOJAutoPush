import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());

    Map<Long, Integer> map = new HashMap<>();
    for (int i = 0; i < N; ++i) {
      long key = Long.parseLong(br.readLine());
      if (map.containsKey(key)) {
        int count = map.get(key);
        map.replace(key, count, count + 1);
      } else {
        map.put(key, 1);
      }
    }

    int max = 0;
    long maxKey = 0;
    List<Long> keySet = map.keySet().stream().collect(Collectors.toList());
    keySet.sort(Long::compareTo);
    for (Long key : keySet) {
      int val = map.get(key);
      if (max < val) {
        max = val;
        maxKey = key;
      }
    }

    sb.append(maxKey);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
