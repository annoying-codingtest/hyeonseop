import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<Character>();
		for(int t=0; t<tc; t++) {
			char[] paranthesis = br.readLine().toCharArray();
			for(int i=0; i<paranthesis.length; i++) {
				if(stack.size() > 0 && stack.peek() == '(' && paranthesis[i] == ')')
					stack.pop();
				else
					stack.add(paranthesis[i]);
			}
			if(stack.size() > 0) 
				System.out.println("NO");
			else
				System.out.println("YES"); 
			stack.clear();
		}
	}
}
