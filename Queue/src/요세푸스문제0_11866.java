import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제0_11866 {
	static int K, N, tmp, cnt=0;
	static int[] ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		ans = new int[N];
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1; i<=N; i++) {
			q.offer(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		while(!q.isEmpty()) {
			tmp = q.poll();
			if(++cnt%K == 0) {
				sb.append(tmp).append(", ");
			}else
				q.offer(tmp);
		}
		sb.setLength(sb.length()-2);
		sb.append(">");
		System.out.println(sb);
	}
}
