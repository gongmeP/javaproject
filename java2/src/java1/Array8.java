package java1;

import java.util.Arrays;

public class Array8 {

	// 배열병합 응용
	public static void main(String[] args) {
		// 응용문제7
		// 데이터 배열 2가지가 있습니다. 해당 데이터 배열을 다음 결과처럼 값을 출력시키시오.

		String data1[] = { "대한민국", "일본", "중국", "배트남", "태국" };
		int data2[] = { 40, 35, 70, 55, 32 };
		int ea = data1.length;
		String data3[] = new String[ea];
		System.out.println(Arrays.toString(data1));
		System.out.println(Arrays.toString(data2));
		int x = 0;
		while (x < ea) {

			data3[x] = data1[x] + "(" + data2[x] + ")";
			// String 에 숫자 더해서 문자로 인식

//			data3[x] = data1[x] + "("+ String.valueOf( data2[x] )+ ")";  // 문자변환
//			data3[x] = data1[x] + "("+ Integer.toString( data2[x] )+ ")"; // 문자변환
			x++;
		}
		System.out.println(Arrays.toString(data3));
	}

}
