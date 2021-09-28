import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M1_15649 {
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); m = Integer.parseInt(st.nextToken());
		boolean[] visit = new boolean[n+1];
		int[] selected = new int[m];
		dfs(0, visit, selected);
		System.out.println(sb);
	}
	private static void dfs(int depth, boolean[] v, int[] selected) {
		if(depth == m) {
			for(int s : selected)
				sb.append(s).append(" ");
			sb.append("\n");
			return;
		}
		for(int i=1; i<=n; i++) {
			if(v[i]) continue;	 	// 이미 뽑았던 수면 pass
			selected[depth] = i;
			v[i] = true;	
			dfs(depth + 1, v, selected);
			v[i] = false;			
		}
	}
}
