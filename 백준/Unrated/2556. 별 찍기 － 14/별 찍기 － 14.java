interface Main {
    static void main(String[] b) {
        int a = new java.util.Scanner(System.in).nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < a; ++j) {
                s.append("*");
            }
            s.append("\n");
        }
        System.out.print(s);
    }
}