import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로읽기_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] words = new char[5][]; 
		for(int i=0; i<5; i++) 
			words[i] = br.readLine().toCharArray();
		
		for(int i=0; i<15; i++) 
			for(int j=0; j<5; j++) 
				if(i < words[j].length) 
					sb.append(words[j][i]);
		
		System.out.println(sb);
	}
}