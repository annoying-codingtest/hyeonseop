import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토_7576 {
	static int m, n, tomatoCnt, blankCnt;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	static int[][] grp;
	static Queue<Data> q;
	static boolean[][] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		grp = new int[n][m];
		q = new LinkedList<Data>();
		visit = new boolean[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				int in = Integer.parseInt(st.nextToken());
				if(in == 1) {
					visit[i][j] = true;
					q.offer(new Data(i, j, 0));
				}
				else if(in == -1) 
					blankCnt++;
				grp[i][j] = in;
			}
		}
		int totDays = bfs(0);
		if(tomatoCnt + blankCnt != n*m)
			System.out.println(-1);
		else
			System.out.println(totDays);
	}
	
	private static int bfs(int days) {
		while(!q.isEmpty()) {
			Data cur = q.poll();
			int r = cur.r;
			int c = cur.c;
			days = cur.days;
			tomatoCnt++;
			for(int d=0; d<4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				
				if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
				if(visit[nr][nc]) continue;
				if(grp[nr][nc] != 0) continue;
				
				visit[nr][nc] = true;
				q.add(new Data(nr, nc, days+1));
			}
		}
		return days;
	}

	static class Data {
		int r;
		int c;
		int days;
		Data(int r, int c, int days){
			this.r = r;
			this.c = c;
			this.days = days;
		}
	}
}
