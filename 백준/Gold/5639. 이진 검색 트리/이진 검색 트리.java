import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] tree = new int[100003];

    public static void main(String[] args) throws IOException {
        String in = br.readLine();
        Node root = new Node(parseInt(in));

        while ((in = br.readLine()) != null && !"".equals(in)) {
            root.add(parseInt(in));
        }
        root.postOrder();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }

        void add(int n) {
            if (value > n) {
                if (left == null) {
                    left = new Node(n);
                } else {
                    left.add(n);
                }
            } else {
                if (right == null) {
                    right = new Node(n);
                } else {
                    right.add(n);
                }
            }
        }

        void postOrder() {
            if (left != null) {
                left.postOrder();
            }
            if (right != null) {
                right.postOrder();
            }
            sb.append(value).append("\n");
        }
    }
}
