import java.io.*;

class Main{
    static int N;
    static StringBuilder sb= new StringBuilder();
    static int[] result;
    static boolean[] visited;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        result = new int[N];
        visited = new boolean[N];
        backtracking(0);
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    private static void backtracking(int depth){
        if (depth == N) {
            for (int i = 0; i< result.length; ++i) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
   
        
        for (int i = 0; i < N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i + 1;
                backtracking(depth + 1);
                visited[i] = false;
            }
        }
    }
}