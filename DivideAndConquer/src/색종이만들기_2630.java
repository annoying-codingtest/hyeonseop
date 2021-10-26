import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 색종이만들기_2630 {
	static int n;
	static int[][] grp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		grp = new int[n][n];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0, k=0; j<n; j++, k+=2)
				grp[i][j] = str.charAt(k) - '0';
		}
		
		
	}
}
