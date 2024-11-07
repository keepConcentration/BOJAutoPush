import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] currentTimeStrArr = br.readLine().split(":");
        String[] startTimeStrArr = br.readLine().split(":");


        int currentTime = Integer.parseInt(currentTimeStrArr[0]) * 3600
                + Integer.parseInt(currentTimeStrArr[1]) * 60
                + Integer.parseInt(currentTimeStrArr[2]);

        int startTime = Integer.parseInt(startTimeStrArr[0]) * 3600
                + Integer.parseInt(startTimeStrArr[1]) * 60
                + Integer.parseInt(startTimeStrArr[2]);

        int resultTime = Math.abs(currentTime - startTime);
        if (resultTime > 86400) {
            resultTime -= 86400;
        }
        if (currentTime > startTime) {
            resultTime = 86400 - resultTime;
        }

        int resultSeconds = resultTime % 60;
        resultTime -= resultSeconds;

        int resultHours = resultTime / 3600;
        resultTime -= resultHours * 3600;

        int resultMinutes = resultTime / 60;


        if (resultHours < 10) {
            sb.append("0");
        }
        sb.append(resultHours).append(":");

        if (resultMinutes < 10) {
            sb.append("0");
        }
        sb.append(resultMinutes).append(":");

        if (resultSeconds < 10) {
            sb.append("0");
        }
        sb.append(resultSeconds);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}