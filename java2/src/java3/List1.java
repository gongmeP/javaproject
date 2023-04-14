package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	// List 라이브러리
	public static void main(String[] args) {
		String member[] = { "박소은", "윤준승", "김여름" };
		// ArrayList : java 라이브러리 배열 메소드
		// Array.asList : 로드할 배열값을 말함 (member(원시배열) > al(현대배열?) 변환)
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(member));

		System.out.println(al.size());

		// add 추가 : add 사용시 무조건 맨뒤에 데이터가 추가됨 . 
		// index번호 적용후 실행시 해당 index부분에 추가됨
		
		// get 배열 데이터로드
		// remove 배열값 삭제
		// size 배열 데이터 갯수

		
		al.add(1,"심규환");
		al.add("이하늘");
		System.out.println(al);

		String user = al.get(4);
		System.out.println(user);

		al.remove(4);
		System.out.println(al);

	}

}
