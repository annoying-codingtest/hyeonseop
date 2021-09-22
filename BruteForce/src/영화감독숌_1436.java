import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌_1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int shom = 666;
		int ans = 0;
		while(n > 0) {
			n--;
			while(true) { 
				if(String.valueOf(shom).contains("666")) {
					ans = shom++;
					break;
				}
				shom++;
			}
		}
		System.out.println(ans);
	}
}
