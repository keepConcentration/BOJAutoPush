import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    List<Student> list = new ArrayList<>();
    String[] arr;
    for (int i = 0; i < N; ++i) {
      arr = br.readLine().split(" ");
      list.add(new Student(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
          Integer.parseInt(arr[3])));
    }

    list.sort((o1, o2) -> {
      if (o1.korean != o2.korean) {
        return o2.korean - o1.korean;
      }
      if (o1.english != o2.english) {
        return o1.english - o2.english;
      }
      if (o1.math != o2.math) {
        return o2.math - o1.math;
      }
      return o1.name.compareTo(o2.name);
    });

    for (Student s : list) {
      sb.append(s.name).append("\n");
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  public static class Student {

    private String name;
    private int korean;
    private int english;
    private int math;

    public Student(String name, int korean, int english, int math) {
      this.name = name;
      this.korean = korean;
      this.english = english;
      this.math = math;
    }
  }
}
