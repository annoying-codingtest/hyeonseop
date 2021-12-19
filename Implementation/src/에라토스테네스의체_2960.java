import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 에라토스테네스의체_2960 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		boolean[] v = new boolean[n+1];
		boolean breaker = false;
		for(int i=2; i<=n; i++) {	// 2부터 숫자 하나씩 체크
			if(v[i]) continue;		// 소수가 아니면 pass
			for(int j=i; j<=n; j+=i)	// 배수들을 지움
				if(!v[j]) {		// ex) 6은 2에 의해 이미 걸러졌으므로 3의 배수로 지울 시 카운팅x
					v[j] = true;
					if(--k == 0) {
						System.out.println(j);
						breaker = true;
					}
			}
			if(breaker) break;
		}
	}
}
