package java1;

import java.util.Scanner;

public class Class_Array2 {

	// 2개의 배열값 - scoring.java 연결
	// 응용문제2.
	// 검색하고자 하는 이름을 적어주세요 출력. 후 이순신 검색시
	// "이순신님은 80점 입니다." 라고 출력 , scoring 에서 해당 배열에 있는 검색하는 용도로만 사용

	public static void main(String[] args) {
		String a1[] = { "홍길동", "이순신", "강감찬", "유관순", "김유신" };
		String a2[] = { "100", "80", "39", "42", "55" };
		scoring datas = new scoring(); // 외부 클래스 로드. 객체생성

		Scanner x1 = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요");
		String x1s = x1.next().intern(); // 사용자 입력단어
		datas.sch(a1, a2, x1s); // 해당 메소드로 3개의 인자값 전달

	}

}
