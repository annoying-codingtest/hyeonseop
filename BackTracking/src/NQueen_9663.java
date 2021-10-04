import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NQueen_9663 {
	static int n, cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		boolean[][] v = new boolean[n][n];
		dfs(0, v);
	}
	
	private static void dfs(int row, boolean[][] visit) {
		if(n == row) {
			cnt++;
			return;
		}
		for(int col=0; col<n; col++) {
			if(visit[row][col]) continue;	// 방문체크
			CantPutQueen(row, col, visit);
			
			
		}
	}
	
	private static void CantPutQueen(int row, int col, boolean[][] visit) {		// 다음 퀸이 놓을 수 없는 곳 체크
		for(int i=0; i<n-row; i++) {
			for(int j=-1; j<2; j++) 
				if(row + i >= 0 && row + i < n && col + j*i >= 0 && col + j*i < n)
					visit[row + i][col + j*i] = true;
		}
	}
	
}
