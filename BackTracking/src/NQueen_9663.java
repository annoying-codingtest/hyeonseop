import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NQueen_9663 {
	static int n, cnt;
	static ArrayList<Pos> queens;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		queens = new ArrayList<Pos>(); 
		for(int col=0; col<n; col++) {
			queens.add(new Pos(0, col));
			dfs(1, queens);
			queens.remove(0);
		}
		System.out.println(cnt);
	}

	private static void dfs(int row, ArrayList<Pos> queens) {
		if(n == row) {
			cnt++;
			return;
		}
		for(int col=0; col<n; col++) {
			boolean flag = true;
			for(Pos q : queens) {
				if(col == q.c) flag = false;
				else if((row - q.r) == Math.abs(col - q.c)) flag = false;
			}
			if(flag) {
				queens.add(new Pos(row, col));
				dfs(row + 1, queens);
				queens.remove(row);
			}
		}
	}
	
	static class Pos{
		int r = 0;
		int c = 0;
		Pos(int r, int c){
			this.r = r;
			this.c = c;
		}
	}
}
