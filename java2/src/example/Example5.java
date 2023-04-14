package example;

import java.util.Arrays;
import java.util.Collections;

public class Example5 {
	// 반복문 (for, while, do~while)
	// 배열 관련 (for (:) )
	Integer data[] = { 10, 8, 5, 3, 1 };
	String data2[] = {"b", "c", "z" , "a" , "e" , "d"};
	public static void main(String[] args) {
		Example5 ex = new Example5();
		ex.array();

	}

	void array() {
//		Arrays.sort(data); // 오름차순 정렬
		Arrays.sort(this.data, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println(Arrays.toString(this.data));
//		Collections.reverseOrder() : int 일때는 사용 못함 > Integer 사용
		
		Arrays.sort(this.data2, Collections.reverseOrder()); 
		System.out.println(Arrays.toString(this.data2));


		// 응용문제2 해당 배열에 모든 값을 합한 결과를 출력하시오.
		int x = 0;
		int ea = this.data.length;
		int sum = 0;
		while (x < ea) {

			sum += this.data[x];
			x++;
		}
		System.out.println(sum);
	}

}
