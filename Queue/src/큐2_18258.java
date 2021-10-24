import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 큐2_18258 {
	static int n, front = 0, rear = 0;
	static int[] queue;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		queue = new int[2000010];
		sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			operating(st);
		}
		System.out.println(sb);
	}
	
	private static void operating(StringTokenizer st) {
		switch(st.nextToken()) {
		case "push":
			queue[rear++] = Integer.parseInt(st.nextToken());
			break;
		case "pop":
			if(front >= rear) 
				sb.append("-1\n");
			else		
				sb.append(queue[front++]).append("\n");
			break;
		case "size":
			sb.append(rear - front).append("\n");
			break;
		case "empty":
			if(front >= rear) 
				sb.append("1\n");
			else
				sb.append("0\n");
			break;
		case "front":
			if(front >= rear) 
				sb.append("-1\n");
			else 
				sb.append(queue[front]).append("\n");
			break;
		case "back":
			if(front >= rear) 
				sb.append("-1\n");
			else 
				sb.append(queue[rear-1]).append("\n");
			break;
		}
	}
}
