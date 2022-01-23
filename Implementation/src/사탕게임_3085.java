import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 사탕게임_3085 {
	static int maxCnt, n;
	static char[][] grp;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		grp = new char[n][n];
		for(int i=0; i<n; i++)
			grp[i] = br.readLine().toCharArray();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				carc(i, j, grp[i][j], 'X');
				carc(i, j, grp[i][j], 'Y');
				for(int d=0; d<4; d++) {
					int nr = i + dr[d];
					int nc = j + dc[d];
					if(nr>=0 && nc>=0 && nr<n && nc<n) {
						swap(i, j, grp[i][j], nr, nc, grp[nr][nc]);
						carc(i, j, grp[i][j], 'X');
						carc(i, j, grp[i][j], 'Y');
						swap(nr, nc, grp[nr][nc], i, j, grp[i][j]);
					}
				}
			}
		}
		System.out.println(maxCnt);
	}
	
	
	private static void swap(int i, int j, char c1, int nr, int nc, char c2) {
		grp[i][j] = c2;
		grp[nr][nc] = c1;
	}


	private static void carc(int r, int c, char color, char dir) {
		int cnt = 1;
		if(dir == 'Y') {
			for(int i=r+1; i<n; i++) {
				if(grp[i][c] != color) break;
				cnt++;
			}
			for(int i=r-1; i>=0; i--) {
				if(grp[i][c] != color) break;
				cnt++;
			}
		}
		if(dir == 'X') {
			for(int j=c+1; j<n; j++) {
				if(grp[r][j] != color) break;
				cnt++;
			}
			for(int j=c-1; j>=0; j--) {
				if(grp[r][j] != color) break;
				cnt++;
			}
		}
		if(maxCnt < cnt) {
			maxCnt = cnt;
		}
	}
	
	
}
