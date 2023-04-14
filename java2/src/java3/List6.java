package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class List6 {
	//List, ArrayList : 데이터 추가 빠름 (맨 뒤에 순차적으로 저장)
	//단점은 검색이 느림, 삭제 느림 (노드번호가 무조건 0부터 시작)

	//LinkedList : 검색 속도가 배열 선언문 중에서 가장 빠름
	//데이터 추가 저장, 삭제 빠름 (노드번호 개념이 없음 , 맨 앞으로 순차 저장)
	//단점 : 메모리  할당이 높음, 크기변경을 못함
	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3, 4, 5 };
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
		System.out.println(ln);
		ln.addFirst(2);
		ln.addLast(30);
		ln.removeLast(); // 맨 뒤 삭제
		ln.remove(5); //5번째꺼 삭제
//		Collections.sort(ln);
		System.out.println(ln);

		String b[] = {"aa","bb","cc","dd"};
		LinkedList<String> ls = new LinkedList<>(Arrays.asList(b));
		ls.remove("cc");
		ls.addFirst("zz");
		System.out.println(ls);
		
	}
	

}
