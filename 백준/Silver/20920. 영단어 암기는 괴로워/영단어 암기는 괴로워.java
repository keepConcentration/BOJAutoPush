import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.regex.Matcher;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            String s = br.readLine();
            if (s.length() < M) {
                continue;
            }

            if (wordMap.containsKey(s)) {
                int oldValue = wordMap.get(s);
                wordMap.replace(s, oldValue, oldValue + 1);
            } else {
                wordMap.put(s, 1);
            }
        }
        List<String> wordList = new ArrayList<>(wordMap.keySet());

        Collections.sort(wordList, (prev, next) -> {
            if ((int) wordMap.get(prev) != wordMap.get(next)) {
                return Integer.compare(wordMap.get(next), wordMap.get(prev));
            }
            if (prev.length() != next.length()) {
                return next.length() - prev.length();
            }
            return prev.compareTo(next);
        });

        for (int i = 0; i < wordList.size(); ++i) {
            sb.append(wordList.get(i)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}