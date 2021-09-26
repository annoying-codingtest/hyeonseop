import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 좌표압축_18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		// 입력배열 초기화
		// [2, 4, -10, 4, -9]
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		// 입력배열 복사, 중복제거, 정렬 
		// [-10, -9, 2, 4]
		int[] copiedArr = Arrays.stream(arr.clone()).distinct().sorted().toArray();
		
		
		// 해쉬맵으로 복사배열 값에 대한 index 출력
		// [(-10, 0), (-9, 1), (2, 2), (4, 3)]
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<copiedArr.length; i++) 
			hm.put(copiedArr[i], i);
		
		for(int a : arr)
			sb.append(hm.get(a)).append(" ");
		System.out.println(sb);
	}
}
