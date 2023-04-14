package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List5 {

	//List 배열 사용법
	//List (Array 업그레이드) 순서가 있는 데이터 집합. 배열과는 다르게 빈 배열 허용안함
	//메모리 공간의 크기를 동적으로 변경가능
	//메모리 재사용 편함
	public static void main(String[] args) {
	
		String data[] = {"hong","kim","park"};
		List<String> aa = new ArrayList<>(Arrays.asList(data));
		System.out.println(aa);
		
		// List는 인터페이스로서의 역할을 하며, ArrayList는 List 인터페이스를 구현한 클래스 중 하나입니다. 
		// ArrayList는 내부적으로 배열을 사용하며, 크기를 동적으로 조절할 수 있습니다.
		
		List<Integer> bb = new ArrayList<>(1); // 저장 가능한 메모리 크기 
		//1 = 1M


		int x = 0;
		while(x < 100000) {
			bb.add(x);
			x++;
			
		}
		
		System.out.println(bb);
	}

}
