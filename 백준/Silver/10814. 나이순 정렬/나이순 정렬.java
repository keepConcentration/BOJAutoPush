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
        Comparator<BojMember> c = new BojMemberComparator();
        int loop = Integer.parseInt(br.readLine());
        
        BojMember[] bm = new BojMember[loop];
        
        for (int i = 0; i < loop; ++i) {
            String[] param = br.readLine().split(" ");
            bm[i] = new BojMember(Integer.parseInt(param[0]), param[1]);
        }
        
        Arrays.sort(bm, c);
        
        for (int i = 0; i < loop; ++i) {
            sb.append(String.valueOf(bm[i].age));
            sb.append(" ");
            sb.append(bm[i].name);
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class BojMemberComparator implements Comparator<BojMember> {
    @Override
    public int compare(BojMember a, BojMember b) {
        return a.age - b.age;
    }
}

class BojMember {
    int age;
    String name;
    public BojMember(int age, String name) {
        this.age = age;
        this.name = name;
    }
}