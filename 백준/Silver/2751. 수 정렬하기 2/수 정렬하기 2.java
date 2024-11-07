import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {
    static int[] arr;
    static int[] mergeArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int loop = Integer.parseInt(br.readLine());
        arr = new int[loop];
        mergeArr = new int[loop];
        
        for (int i = 0; i < loop; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        divideSort(0, arr.length - 1);
        for (int i = 0; i < arr.length; ++i) {
            sb.append(arr[i]);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    static void divideSort(int left, int right) {
        if (left != right) {
            int mid = (left + right) / 2;
            divideSort(left, mid);
            divideSort(mid + 1, right);
            mergeSort(left, right);
        }
    }
    
    static void mergeSort(int left, int right) {
        int mid = (left + right) / 2;
        int i = left;
        int j = mid + 1;
        int mergeArrIdx = left;
        
        while (i <= mid || j <= right) {
            if (j > right || (i <= mid && arr[i] < arr[j])) {
			    mergeArr[mergeArrIdx] = arr[i];
			    i++;
		    } else {
			    mergeArr[mergeArrIdx] = arr[j];
			    j++;
		    }
            mergeArrIdx++;
        }
        for(int k = left; k <= right; k++) {
			arr[k] = mergeArr[k];
		}
    }
}