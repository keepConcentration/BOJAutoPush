class Main {
    public static void main(String[]args) {
        Main main = new Main();
        boolean[] isD = new boolean[10001];
        for (int i = 1; i < 10001; ++i) {
            int di = main.d(i);
            if (di < 10000) isD[di] = true;
        }
        for (int i = 1; i < 10000; ++i) {
            if (!isD[i]) System.out.println(i);
        }
    }
    private int d(int param) {
        String strParam = String.valueOf(param);
        int result = param;
        for (int i = 0; i < strParam.length(); ++i) {
            result += Integer.parseInt(strParam.substring(i, i + 1));
        }
        return result;
    }
}