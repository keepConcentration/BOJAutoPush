import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String in = s.next();
            if (in.equals("Algorithm")) {
                sb.append("204\n");
            } else if (in.equals("DataAnalysis")) {
                sb.append("207\n");
            } else if (in.equals("ArtificialIntelligence")) {
                sb.append("302\n");
            } else if (in.equals("CyberSecurity")) {
                sb.append("B101\n");
            } else if (in.equals("Network")) {
                sb.append("303\n");
            } else if (in.equals("Startup")) {
                sb.append("501\n");
            } else {
                sb.append("105\n");
            }
        }
        System.out.print(sb);
    }
}