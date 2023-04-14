package java3;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {

	// 무한루프로 배열 코드 연계
	public static void main(String[] args) {

//		for(;;) {}
		
		//무한루프 사용하는 이유는 : DB 갯수에 따라 전체적으로 반복 하기 위함
		Scanner sc = new Scanner(System.in);

		// 빈배열
		ArrayList<Integer> al = new ArrayList<>();
		Integer no; // 입력하는 값 저장을 위한 변수
		
		while (true) {
			System.out.println("숫자를 입력해 주세요");
			no = sc.nextInt();
			al.add(no); // 빈 배열에 입력값 저장
			int ea = al.size(); // 갯수확인
			if (ea >= 10) { // 갯수가 10개 이상이면 정지
				break;
			}
		}
		System.out.println(al);
		sc.close();
	}

}
