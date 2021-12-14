import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 집합_11723 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		boolean[] v = new boolean[21];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "add":
				v[Integer.parseInt(st.nextToken())] |= true;
				break;
			case "remove":
				v[Integer.parseInt(st.nextToken())] &= false;
				break;
			case "check":
				sb.append(v[Integer.parseInt(st.nextToken())] ? 1 : 0).append("\n");
				break;
			case "toggle":
				v[Integer.parseInt(st.nextToken())] ^= true;
				break;
			case "all":
				Arrays.fill(v, true);
				break;
			case "empty":
				v = new boolean[21];
				break;
			}
		}
		System.out.println(sb);
	}
}
