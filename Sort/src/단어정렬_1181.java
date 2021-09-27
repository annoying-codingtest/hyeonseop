import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class 단어정렬_1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int n = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<String>();
		for(int i=0; i<n; i++)
			hs.add(br.readLine());
		ArrayList<String> arr = new ArrayList<String>(hs);	// Set -> ArrayList 변환
		
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return o1.length() - o2.length();
			}
		});
		
		for(String s : arr)
			sb.append(s).append("\n");
		System.out.println(sb);
	}
}
