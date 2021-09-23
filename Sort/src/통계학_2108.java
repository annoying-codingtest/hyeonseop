import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 통계학_2108 {
	static int mean = 0, median = 0, mode = 0, bound = 0;	// 평균, 중앙, 최빈, 범위
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		for(int i=0; i<n; i++)
			nums[i] = Integer.parseInt(br.readLine());
		
		// 평균값
		mean = Math.round(Arrays.stream(nums).sum()/((float) n));
		
		// 중앙값
		Arrays.sort(nums);
		median = nums[n/2];
		
		// 최빈값
		int[] visit = new int[8001];	// num: -4000 ~ +4000, index: 0 ~ 8000  
		for(int i=0; i<n; i++) 
			visit[nums[i] + 4000]++;	// 중복된 값이 있으면 카운팅
		int max = 0;					// 최대 빈출 횟수
		boolean flag = false;			// 최빈값 중 두 번째까지만 체크
		for(int i=0; i<=8000; i++) {
			if(visit[i] > max) {
				max = visit[i];
				mode = i - 4000;
				flag = false;
			}
			else if(visit[i] == max && !flag) {
				mode = i - 4000;
				flag = true;
			}
		}
		
		// 범위
		bound = nums[n-1] - nums[0];
		
		// 출력
		System.out.println(mean + "\n" + median + "\n" + mode + "\n" + bound);
	}
}
