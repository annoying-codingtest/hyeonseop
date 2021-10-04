import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen_9663 {
	static int n;
	static boolean[][] v;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		v = new boolean[n][n];
		dfs(0, v);
		
	}
	private static void dfs(int depth, boolean[][] visit) {
		if(n == depth)
			return;
		for(int j=0; j<n; j++) {
			
		}
	}
}
