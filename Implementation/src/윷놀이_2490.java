import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 윷놀이_2490 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] sum = {0, 0, 0};
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens())
				sum[i] += Integer.parseInt(st.nextToken());
		}
		char[] score = {'D', 'C', 'B', 'A', 'E'};
		for(int i=0; i<3; i++) 
			System.out.println(score[sum[i]]);
	}
}
