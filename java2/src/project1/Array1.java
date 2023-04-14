package project1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {

	//ArrayList 배열 문자,숫자 혼합 사용하기
	public static void main(String[] args) {
		
		String data[]= {"hong","park"}; // 문자 배열
		int data2[] = {10,20}; // 숫자 배열
		
		//ArrayList 가 String 자료형으로 int 배열은 받지 못함
		
		//Object 문자,숫자 자료형과 관련없이 모든 자료형을 받아주는 자료형 구조
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		li.add(data2[0]);
		li.add(data2[1]);
		System.out.println(li);
		
		//계산방식
		//1.
		//int sum = (int)li.get(2) + (int)li.get(3);
		
		//2.
//		Object sum = (int)li.get(2) + (int)li.get(3);
		
		//3.
		Object sum = (Integer)li.get(2) + (Integer)li.get(3);
		System.out.println(sum);

		
		//추가로 ArrayList 안에 데이터가 어떤 자료형인지 알아내는 방법.
		//.getClass().getName() 를 이용하여 해당 데이터가 문자인지 숫자인지 파악
		System.out.println(li.get(2).getClass().getName());
	}

}
