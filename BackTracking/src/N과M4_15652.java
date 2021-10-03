import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M4_15652 {
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int[] selected = new int[m];
		selected[0] = 1;
		dfs(0, selected, 1);
		System.out.println(sb);
	}
	
	private static void dfs(int depth, int[] selected, int curNum) {
		if(depth == m) {
			for(int s : selected)
				sb.append(s).append(" ");
			sb.append("\n");
			return;
		}
		for(int i=curNum; i<=n; i++) {
			selected[depth] = i;
			dfs(depth + 1, selected, i);
		}
	}
}