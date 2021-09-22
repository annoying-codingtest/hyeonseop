import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜계산_1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken())-1;
		int s = Integer.parseInt(st.nextToken())-1;
		int m = Integer.parseInt(st.nextToken())-1;
		int[] year = new int[3];
		year[0] = year[1] = year[2] = 0;
		int cnt = 1;
		while(!(year[0] == e && year[1] == s && year[2] == m)) {
			year[0] = (year[0] + 1)%15;
			year[1] = (year[1] + 1)%28;
			year[2] = (year[2] + 1)%19;
			cnt++;
		}
		System.out.println(cnt);
	}
}
