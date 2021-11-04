import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬곱셈_2740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] mA = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++)
				mA[i][j] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		int[][] mB = new int[m][k];
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<k; j++)
				mB[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int[][] ans = new int[n][k];
		for(int d=0; d<m; d++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<k; j++) {
					ans[i][j] += mA[i][d] * mB[d][j];
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<k; j++) 
				sb.append(ans[i][j] + " ");
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
