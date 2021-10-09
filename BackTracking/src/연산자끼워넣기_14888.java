import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 연산자끼워넣기_14888 {
	static int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	static int[] nums;
	static int[] opCnt = new int[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++)
			nums[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++)
			opCnt[i] = Integer.parseInt(st.nextToken());
		
		dfs(0, nums[0]);
		System.out.println(max + "\n" + min);
	}
	
	private static void dfs(int cnt, int res) {
		if(cnt == n-1) {
			max = Math.max(max, res);
			min = Math.min(min, res);
			return;
		}
		if(opCnt[0] > 0) {
			opCnt[0]--;
			dfs(cnt + 1, res + nums[cnt + 1]);
			opCnt[0]++;
		}
		if(opCnt[1] > 0) {
			opCnt[1]--;
			dfs(cnt + 1, res - nums[cnt + 1]);
			opCnt[1]++;
		}
		if(opCnt[2] > 0) {
			opCnt[2]--;
			dfs(cnt + 1, res * nums[cnt + 1]);
			opCnt[2]++;
		}
		if(opCnt[3] > 0) {
			opCnt[3]--;
			dfs(cnt + 1, res/nums[cnt + 1]);
			opCnt[3]++;
		}
	}
	
}
