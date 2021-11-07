import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 바이러스_2606 {
	static int n, m, cnt = 0;
	static LinkedList<Integer>[] links;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		visit = new boolean[n+1];
		links = new LinkedList[n+1];
		for(int i=1; i<n+1; i++)
			links[i] = new LinkedList<Integer>();
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			links[a].add(b);
			links[b].add(a);
		}
		
		visit[0] = visit[1] = true;
		dfs(1);
		System.out.println(cnt);
	}
	private static void dfs(int node) {
		Iterator<Integer> iter = links[node].iterator();
		while(iter.hasNext()) {
			int tmp =iter.next();
			if(visit[tmp])
				continue;
			cnt++;
			visit[tmp] = true;
			dfs(tmp);
		}
	}	
}
