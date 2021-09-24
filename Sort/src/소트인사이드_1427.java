import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 소트인사이드_1427 {
	public static void main(String[] args) {
		Integer[] arr = new Scanner(System.in).nextLine().chars().map(x->x-'0').boxed().toArray(Integer[]::new);	// Integer형 배열 생성
		Arrays.sort(arr, Comparator.reverseOrder());	// 내림차순 정렬
		Arrays.stream(arr).forEach(System.out::print);	// 출력
	}
}
