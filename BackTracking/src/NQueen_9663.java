import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NQueen_9663 {
	static int n, cnt;
	static int[] queens;	// 퀸의 좌표를 모아둘 배열(index는 퀸의 row값, value는 퀸의 col값)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		queens = new int[n];
		for(int col=0; col<n; col++) {		// (열탐색) 체스판에서 몇 번째 열에 퀸을 놓을지
			queens[0] = col;				// 퀸의 시작 좌표(0,0) ~ (0,n) 
			dfs(1);							// (dfs로 행탐색) 체스판에서 두번째 행부터 탐색 시작
		}
		System.out.println(cnt);
	}

	private static void dfs(int row) {
		if(n == row) {
			cnt++;
			return;
		}
		for(int col=0; col<n; col++) {
			boolean isPutQueen = true;			// 퀸을 놓을 수 있는지, 최초 퀸을 놓을 수 있다고 가정(true) 
			for(int i=0; i<row; i++) 			// 각 행마다 이미 놓여져 있는 퀸에 대해 조사
				if(col == queens[i]) 			// i번째 행의 퀸과 같은 열에 있으면 퀸을 놓지 못하므로 isPutQueen : false
					isPutQueen = false;
				else if((row - i) == Math.abs(col - queens[i]))		// i번째 행의 퀸과 같은 대각선 방향이면 isPutQueen : false
					isPutQueen = false;
			if(isPutQueen) {			// 앞의 행들에 놓여져있는 퀸을 모두 피했다면 퀸을 놓을 준비 완료! 
				queens[row] = col;		// (row, col)좌표에 퀸 set
				dfs(row + 1);			// 다음 행에 놓을 퀸 조사
			}
		}
	}
}
