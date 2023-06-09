package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Example4 {
	//ArrayList, List, LinkedList 에서 사용하는 옵션

	public static void main(String[] args) {

		String data[] = {"hong","kim","park"};
		LinkedList<String> nums = new LinkedList<>(Arrays.asList(data));
		System.out.println(nums);
		nums.clear(); // 배열값 초기화
		System.out.println(nums);
		nums.add("a");
		nums.add("b");
		nums.add("c");
		System.out.println(nums);
		nums.set(2, "zzzz"); // 기존 배열값을 변경할 때 사용
		System.out.println(nums);
		
//		contains : 데이터를 빠르게 찾을 때 사용합니다.
		// 찾고자 하는 값을 적용 했을때 true (데이터확인)
		// flase (데이터 값이 없음)
		boolean result = nums.contains("b");
		System.out.println(result);
	}

}
