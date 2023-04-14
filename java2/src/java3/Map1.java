package java3;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	//key 배열
	
	//Map 사용시 주의사항
	//1. 키는 중복 안됨
	//2. 키 기반이기 떄문에 무조건 키값을 통해서 데이터를 가져옴
	//3. 같은 키를  사용시 기존에 있는 데이터 값은 상실됨
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("id", "hong"); // put("key이름", "데이터")
		map.put("name", "홍길동");
		map.put("id", "kang"); // 키 중복시 기존 데이터 상실
		map.remove("id"); // 삭제시 key 명으로 삭제
		System.out.println(map);
		System.out.println(map.get("name"));
		
		
		//숫자는 0이 먼저 들어갈경우 에러가남
		Map<String,Integer> map2 = new HashMap<>();
		map2.put("number", 10);
//		map2.put("tel", 01012345678);
		map2.put("tel", 1012345678);
		System.out.println(map2);
	}

}
