import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱_10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> que = new LinkedList<Integer>();
		int queSize = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = 0;
			switch(st.nextToken()) {
			case "push_front":
				x = Integer.parseInt(st.nextToken());
				que.addFirst(x);
				queSize++;
				break;
			case "push_back":
				x = Integer.parseInt(st.nextToken());
				que.addLast(x);
				queSize++;
				break;
			case "pop_front":
				if(queSize == 0) 
					sb.append(-1).append("\n");
				else {
					sb.append(que.pollFirst()).append("\n");
					queSize--;
				}
				break;
			case "pop_back":
				if(queSize == 0) 
					sb.append(-1).append("\n");
				else {
					sb.append(que.pollLast()).append("\n");
					queSize--;
				}
				break;
			case "size":
				sb.append(queSize).append("\n");
				break;
			
			case "front":
				if(queSize == 0) 
					sb.append(-1).append("\n");
				else
					sb.append(que.peekFirst()).append("\n");
				break;
			case "back":
				if(queSize == 0) 
					sb.append(-1).append("\n");
				else
					sb.append(que.peekLast()).append("\n");
				break;
			case "empty":
				if(queSize == 0) 
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
