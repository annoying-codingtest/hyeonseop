import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열_1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] sequence = new int[n];
		for(int i=0; i<n; i++) 
			sequence[i] = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		boolean flag = false;
		for(int i=0; i<n; i++) {
			if(!operateStack(sequence[i], stack, max, sb)) {
				flag = true;
				break;
			}
			if(max < sequence[i])
				max = sequence[i];
		}
		
		if(flag)
			System.out.println("NO");
		else
			System.out.println(sb);
	}

	private static boolean operateStack(int num, Stack<Integer> stack, int max, StringBuilder sb) {
		if(max >= num) {		// 스택수열의 수를 포함하면 
			sb.append('-').append("\n");
			if(num != stack.pop())
				return false;
			else
				return true;
		}else {
			for(int i=max+1; i<=num; i++) {
				stack.push(i);
				sb.append('+').append("\n");
			}
			sb.append('-').append("\n");
			stack.pop();
			return true;
		}
	}
}
