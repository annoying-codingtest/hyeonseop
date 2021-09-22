import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class 마인크래프트_18111 {
	static int n, m, b;
	static int[][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); 
		m = Integer.parseInt(st.nextToken()); 
		b = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		int maxFloor = Integer.MIN_VALUE;
		int minFloor = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) { 
				int h = Integer.parseInt(st.nextToken());
				map[i][j] = h;
				if(maxFloor < h) 
					maxFloor = h;
				if(minFloor > h)
					minFloor = h;
			}
		}
		int minTime = Integer.MAX_VALUE;
		int maxHeight = 0;
		for(int h = minFloor; h<=maxFloor; h++) {
			int time = 0;
			int height = h;
			int inven = b;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					int cur =  map[i][j];
					if(cur > height) {
						time += 2*(cur - height);
						inven += cur - height;
					}else if(cur < height) {
						inven -= height - cur;
						time += height - cur;
					}
				}
			}
			if(inven >= 0)
				if(minTime >= time) {
					minTime = time;
					if(maxHeight <= height)
						maxHeight = height;
				}
		}
		System.out.println(minTime + " " + maxHeight);
	}
}
