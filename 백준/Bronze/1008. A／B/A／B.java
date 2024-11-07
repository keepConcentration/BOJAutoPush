import java.io.*;

interface Main {
    static void main(String[] args) throws Exception {
        String[] param = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Double.parseDouble(param[0]) / Double.parseDouble(param[1])));
        bw.flush();
        bw.close();
    }
}