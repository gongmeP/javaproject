package java3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {
//ArrayList , List Linkedlist - 2차배열 선언
	public static void main(String[] args) {
		
		String data[][] = {
				
				{"hong","kim","park"},
				{"서울","강원","경기"}
		};
		
		//String[] : 2차배열 이상 Integer[] : 숫자로된 2차 배열
		ArrayList<String[]> ar = new ArrayList<String[]>(Arrays.asList(data));
		System.out.println(ar.get(1)[1]); // 1번째 열에 1번째 데이터
		int ea = ar.size();
		System.out.println(ea); // 배열 그룹 갯수
		System.out.println(ar.get(0).length); // 0번째 열에 배열 데이터 3개
		System.out.println(Arrays.toString(ar.get(1)));
		
		int x= 0;
		while(x < ea) {
			System.out.println(Arrays.toString(ar.get(x)));
			x++;
		}
		
		//0번째 배열 데이터 출력
		int w = 0;
		while(w<ar.get(0).length) {
			System.out.println(ar.get(0)[w]);
			w++;
		}
		
	}

}
