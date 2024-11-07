import java.io.*;
import java.util.Queue;

class Main {

    static StringBuilder sb = new StringBuilder();
    
    static int N;
    static class Node {
        char cha;
        Node left;
        Node right;

        Node(char cha) {
            this.cha = cha;
            this.left = null;
            this.right = null;
        }

        void setLeft(Node left) {
            this.left = left;
        }

        void setRight(Node right) {
            this.right = right;
        }

        public Node search(char cha) {
            if (this.cha == cha) {
                return this;
            }
            Node search = null;
            if (this.left != null) {
                search = left.search(cha);
            }
            if (search != null) {
                return search;
            }
            if (this.right != null) {
                search = right.search(cha);
            }
            if (search != null) {
                return search;
            }
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        Node rootNode = null;
        for (int i = 0; i < N; ++i) {
            String[] arr = br.readLine().split(" ");
            char root = arr[0].charAt(0);
            char left = arr[1].charAt(0);
            char right = arr[2].charAt(0);
            if (rootNode == null) {
                rootNode = new Node(root);
                if (left != '.') {
                    rootNode.setLeft(new Node(left));
                }
                if (right != '.') {
                    rootNode.setRight(new Node(right));
                }
                continue;
            }
            Node searchNode = rootNode.search(root);
            if (left != '.') {
                searchNode.setLeft(new Node(left));
            }
            if (right != '.') {
                searchNode.setRight(new Node(right));
            }
        }

        preOrder(rootNode);
        sb.append("\n");
        inOrder(rootNode);
        sb.append("\n");
        postOrder(rootNode);
        sb.append("\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void preOrder(Node node) {
        sb.append(node.cha);
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }
    }

    private static void inOrder(Node node) {
        if (node.left != null) {
            inOrder(node.left);
        }
        sb.append(node.cha);
        if (node.right != null) {
            inOrder(node.right);
        }
    }

    private static void postOrder(Node node) {
        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        sb.append(node.cha);
    }
}