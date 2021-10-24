import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++)
			queue.add(i);
		boolean flag = false;
		while(queue.size() != 1) {
			flag = !flag;
			if(!flag) {
				int tmp = queue.poll();
				queue.offer(tmp);
			}else
				queue.poll();
		}
		System.out.println(queue.poll());
	}
}
