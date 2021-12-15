import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 쉽게푸는문제_1292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] arr = new int[1200];
		int idx = 0;
		for(int i=1; i<46; i++)
			for(int j=0; j<i; j++) 
				arr[idx++] += i;
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for(int i=a-1; i<b; i++)
			sum += arr[i];
		System.out.println(sum);
	}
}
