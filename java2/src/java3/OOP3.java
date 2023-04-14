package java3;

import java.util.Arrays;
import java.util.LinkedList;

public class OOP3 {

	//문제 데이터 15,22,37,8,11,19,41 
	// 해당 데이터를 다음 결과같이 커스텀 하여 출력
	// [7,15,22,8,11,39,41]
	public static void main(String[] args) {
		Integer a[] = {15,22,37,8,11,19,41};
		LinkedList<Integer> als = new LinkedList<>(Arrays.asList(a));
		
		als.addFirst(7);
		als.remove(3);
		als.remove(5);
		als.add(5,39);
		
		System.out.println(als);
	}
	

}
