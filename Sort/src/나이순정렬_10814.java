import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 나이순정렬_10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Node> arr = new ArrayList<Node>();
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(new Node(i, Integer.parseInt(st.nextToken()), st.nextToken()));
		}
		
		Collections.sort(arr, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if(o1.age == o2.age)
					return o1.idx - o2.idx;
				else
					return o1.age - o2.age;
			}
		});
		for(Node o : arr)
			sb.append(o.age).append(" ").append(o.name).append("\n");
		System.out.println(sb);
	}
	
	static class Node{
		int idx = 0;
		int age = 0;
		String name = null;
		Node(int i, int age, String name){
			this.idx = i;
			this.age = age;
			this.name = name;
		}
	}
}
