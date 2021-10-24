import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 프린터큐_1966 {
	static int testcase;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		testcase = Integer.parseInt(br.readLine());
		for(int t=0; t<testcase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int[] prior = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) 
				prior[i] = Integer.parseInt(st.nextToken());
			
			//문서의 index와 중요도를 짝으로 큐에 SET
			Queue<int[]> printQueue = new LinkedList<int[]>();
			for(int i=0; i<n; i++) 
				printQueue.offer(new int[] {i, prior[i]});
				
			Arrays.sort(prior);	// 중요도 오름차순 정렬 
			
			int answer = 0, priorIdx = prior.length-1;		// 출력할 답(총 몇번 출력했는지), 문서중요도가 높은 순으로 체크
			
			while(true) {		// 중요도순으로 하나씩 체크해가며 문서를 뽑음
				int[] cur = printQueue.poll();
				int curIdx = cur[0], curPrior = cur[1];		// 현재 큐에서 뽑은 문서의 index, 중요도
				if(prior[priorIdx] == curPrior) {		// 현재 문서가 중요도가 가장 높은 문서면 뽑기, 그렇지 않으면 다음 뒤로 미룸
					priorIdx--;			// 다음 중요도 체크
					answer++;		// 문서를 출력한 횟수 1증가
					if(curIdx == m) {		// target 문서라면 
						System.out.println(answer);
						break;
					}
				}else
					printQueue.offer(cur);
			}
		}
	}
}
