import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M2_15650 {
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); m = Integer.parseInt(st.nextToken());
		boolean[] visit = new boolean[n+1];
		int[] selected = new int[m];
		selected[0] = 1;
		dfs(0, visit, selected, 1);
		System.out.println(sb);
	}
	private static void dfs(int depth, boolean[] v, int[] selected, int curNum) {
		if(depth == m) {
			for(int s : selected)
				sb.append(s).append(" ");
			sb.append("\n");
			return;
		}
		for(int i=curNum; i<=n; i++) {
			if(v[i]) continue;		 	// 이미 뽑았던 수면 pass
			selected[depth] = i;
			v[i] = true;	
			dfs(depth + 1, v, selected, i);		// 뽑은 수 1증가, 뽑힌 수 방문체크 배열, 뽑힌 수들, 가장 최근 뽑은 수
			v[i] = false;			
		}
	}
}
