package project1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

// 사용자가 8명 있음
// 각각의 사용자에게 포인트를 주고 다음과 같이 결과가 나오도록 코드작성

//customer data : 서울 경기도 인천 대전 충북 충남 전북 전남

//"서울 님에게 포인트를 추가 시키겠습니까?"
// ... ~ "전남 님에게 포인트를 추가 시키겠습니까?"
//무조건 숫자 입력 숫자외에 입력시 "포인트는 숫자만 입력합니다." 출력
// 인천에서 오류 발생시 다시 인천부터 실행되도록 해야함

// 최종출력정보 서울 :500 경기 : 300 등등.
public class Example3 {

	public static void main(String[] args) {
		Points bbox = new Points();
		bbox.Points1();

	}

}

class Points {

	Scanner sc1;

	public void Points1() {
		String datas[] = { "서울", "경기", "인천", "대전", "충북", "충남", "전북", "전남" };
		Map<String, Integer> indata = new HashMap<>();
		int x = 0;
		int ea = datas.length;
		Integer po = 0;
		while (x < ea) {
			try {
				sc1 = new Scanner(System.in);
				System.out.printf("%s 님에게 포인트를 추가 하시겠습니까?", datas[x]);
				po = sc1.nextInt();

				indata.put(datas[x], po);
				x++;

			} catch (Exception e) {
				System.out.println("포인트는 숫자만 입력합니다.");
				continue;
			}
		}
		
		int y = 0;
		while (y < ea) {

			System.out.printf("%s : %d \n", datas[y], indata.get(datas[y]));
			y++;
		}

	};

}