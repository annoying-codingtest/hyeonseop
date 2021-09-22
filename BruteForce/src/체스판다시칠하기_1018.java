import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기_1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n][m];
		for(int i=0; i<n; i++) {
			char[] chr = br.readLine().toCharArray();
			for(int j=0; j<m; j++)
				if(chr[j] == 'B')
					map[i][j] = 1;
				else
					map[i][j] = 0;
		}
		int[][] blackBoard = new int[8][8];
		int[][] whiteBoard = new int[8][8];
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(i%2 == 0)
					if(j%2 == 0)
						blackBoard[i][j] = 1;	//왼쪽위 첫번째 칸이 검정색으로 시작하는 체스판
					else
						whiteBoard[i][j] = 1;
				else
					if(j%2 == 0)
						whiteBoard[i][j] = 1;	
					else
						blackBoard[i][j] = 1;
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0; i<=n-8; i++) {
			for(int j=0; j<=m-8; j++) {
				int blackPaint = 0, whitePaint = 0;
				for(int r=i; r<i+8; r++) {
					for(int c=j; c<j+8; c++) {
						if(map[r][c] != blackBoard[r-i][c-j]) 
							blackPaint++;
						else
							whitePaint++;
					}
				}
				int minPaint = 0;
				if(blackPaint < whitePaint)
					minPaint = blackPaint;
				else
					minPaint = whitePaint;
				if(min > minPaint)
					min = minPaint;
			}
		}
		
		System.out.println(min);
	}
}
