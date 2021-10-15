import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 제로_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] stack = new int[n];
		int top = -1;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0)	stack[++top] = num;
			else	--top;			 
		}
		int sum = 0;
		for(int i=0; i<=top; i++)
			sum += stack[i];
		System.out.println(sum);
	}
}
