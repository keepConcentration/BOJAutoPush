import java.io.*;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    
    private static String SPACE = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        byte count = Byte.parseByte(br.readLine());
        Byte[] numArray = new Byte[count];

        String[] in = br.readLine().split(SPACE);

        for (byte i = 0; i < count; ++i) {
            numArray[i] = Byte.parseByte(in[i]);
        }

        LinkedList<Byte> students = IntStream.rangeClosed(1, count)
                .mapToObj((b) -> (byte) b)
                .collect(Collectors.toCollection(LinkedList::new));

        for (int i = 0; i < count; ++i) {
            byte num = numArray[i];
            Byte student = students.get(i);
            students.remove(i);
            students.add(num, student);
        }

        for (int i = students.size() - 1; i >= 0; --i) {
            bw.write(students.get(i) + SPACE);
        }
        bw.flush();
        bw.close();
    }
}
