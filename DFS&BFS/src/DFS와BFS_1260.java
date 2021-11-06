import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS_1260 {
	static int n, m, v;
	static boolean[][] adjMatrix;
	static boolean[] visit;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		adjMatrix = new boolean[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			adjMatrix[r][c] = adjMatrix[c][r] = true; 
		}
		visit[v] = true;
		sb.append(v + " ");
		dfs(v);
		sb.append("\n");
		
		visit = new boolean[n+1];
		visit[v] = true;
		bfs(v);
		System.out.println(sb);
	}
	
	private static void dfs(int cur) {
		for(int next=1; next<n+1; next++) {
			if(adjMatrix[cur][next] && !visit[next]) {
				visit[next] = true;
				sb.append(next + " ");
				dfs(next);
			}
		}
	}
	private static void bfs(int cur) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(cur);
		visit[cur] = true;
		while(!q.isEmpty()) {
			int tmp = q.poll();
			sb.append(tmp + " ");
			for(int i=1; i<n+1; i++) {
				if(visit[i])
					continue;
				if(!adjMatrix[tmp][i])
					continue;
				visit[i] = true;
				q.offer(i);
			}
		}
	}
}
