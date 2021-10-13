import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택_10828 {
	static int n, stackSize = 0;
	static StringBuilder sb;
	static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push":
				stack.add(Integer.parseInt(st.nextToken()));
				stackSize++;
				break;
			case "pop":
				if(stackSize == 0) {
					sb.append("-1\n");
					break;
				}
				sb.append(stack.pop()).append("\n");
				stackSize--;
				break;
			case "size":
				sb.append(stackSize).append("\n");
				break;
			case "empty":
				if(stackSize == 0) 
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			case "top":
				if(stackSize == 0) {
					sb.append("-1\n");
					break;
				}
				sb.append(stack.peek()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
}
