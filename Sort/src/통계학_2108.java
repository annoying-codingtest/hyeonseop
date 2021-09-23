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
		
		//평균값
		mean = Math.round(Arrays.stream(nums).sum());
		
		//중앙값
		Arrays.sort(nums);
		median = nums[n/2];
		
		//최빈값
		int[] visit = new int[8000];
		for(int i=0; i<n; i++) 
			visit[nums[i] + 4000]++;
		for(int i=0; i<n; i++) {
			
		}
		
		//범위
		bound = nums[n-1] - nums[0];
		//Arrays.stream(nums).forEach(System.out::println);
	}
}
