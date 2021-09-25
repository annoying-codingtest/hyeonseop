import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 좌표정렬하기_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[][] pos= new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			pos[i][0] = Integer.parseInt(st.nextToken());
			pos[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(pos, new Comparator<int[]>() {	// Object 정렬을 위한 재정의

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) 
					return o1[1] - o2[1];
				else
					return o1[0] - o2[0];
			}
		});
		
		for(int[] p : pos) 
			sb.append(p[0]).append(" ").append(p[1]).append("\n");
		System.out.println(sb);
	}
}
