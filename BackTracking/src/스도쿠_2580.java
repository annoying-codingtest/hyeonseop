import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 스도쿠_2580 {
	static int blanksCnt;
	static ArrayList<Pos> blanks;
	static int[][] board = new int[9][9];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		blanks = new ArrayList<Pos>();
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num == 0) {
					//if(빈칸 유추 함수)
					//else
						blanks.add(new Pos(i, j, ))
				}
				board[i][j] = num;   
			}
		}
		blanksCnt = blanks.size();
		dfs(0);
		
	}
	
	private static void dfs(int blankIdx) {
		if(blankIdx == blanksCnt) {
			board[blanks.get(blankIdx).r][blanks.get(blankIdx).c] = 1;
			
			
		}
	}

	static class Pos {
		int r = 0;
		int c = 0;
		boolean[] possibleNums = new boolean[10];
		Pos(int r, int c, int num) {
			this.r = r;
			this.c = c;
			this.possibleNums[num] = true; 
		}
	}
	
	// 행, 열으로 빈칸좌표 수 유추 함수 작성; return boolean (유추가능하면 true)
	
	
	// 3x3영역에 대한 빈칸좌표 수 유추 함수 작성;  return boolean (유추가능하면 true)
	
	
}
