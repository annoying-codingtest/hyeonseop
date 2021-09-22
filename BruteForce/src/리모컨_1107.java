import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 리모컨_1107 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String targetNumber = br.readLine().trim();
		int tNum = Integer.parseInt(targetNumber);
		int n = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		char[] brokenNum = null;
		if(n > 0) {
			st = new StringTokenizer(br.readLine());
			brokenNum = new char[n];
			for(int i=0; i<n; i++) 
			brokenNum[i] = st.nextToken().charAt(0);
		}
		if(tNum == 100)
			System.out.println(0);
		else {
			int min = Math.abs(tNum - 100);
			int touchCnt = 999999;
			if(isDirect(targetNumber, brokenNum))
				if(min > targetNumber.length())
					min = targetNumber.length();
			touchCnt = nearChanel(tNum, brokenNum, 0);
			
			System.out.println(Math.min(min, touchCnt));
		}
	}

	//한번에 채널이동이 가능한지
	private static boolean isDirect(String target, char[] brokenNum) {
		if(brokenNum == null)
			return true;
		for(int i=0; i<target.length(); i++) 
			for(int j=0; j<brokenNum.length; j++) 
				if(target.charAt(i) == brokenNum[j]) 
					return false;
		return true;
	}
	
	//가장 가까운 숫자로 이동후 거리 반환
	private static int nearChanel(int tNum, char[] brokenNum, int minNum) {
		int minDiff = 999999;
		int numCnt = 99999;
		for(int i=0; i<=999999; i++) {
			if(!isDirect(String.valueOf(i), brokenNum))
				continue;
				
			int diff = Math.abs(tNum - i);
			if(minDiff > diff) {
				minDiff = diff;
				minNum = i;
				numCnt = String.valueOf(i).length();
			}
		}
		return Math.abs(minNum - tNum) + numCnt;
	}
}
