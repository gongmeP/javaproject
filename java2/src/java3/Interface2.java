package java3;

import java.text.DecimalFormat;
import java.util.Scanner;

//http://mekeyace.dothome.co.kr/userdb.txt
//user1 user2.java interface 연결
public class Interface2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력하세요");
		String id = sc.next();
		sc.close();
		userinfo ui = new userinfo();
		ui.myinfo(id);

	}

}

//사용자 포인트 확인하는 페이지 구성
class userinfo implements user2, user1 {
	private int total; // 필드에 있는 변수만 this 사용

	@Override
	public void myinfo(String userid) {
		this.total = dataea();
		System.out.println(this.total);

		int cnt = 0;
		int x = 0;

		int point = 0;
		
//		데이터 로드 부하를 줄이기 위해 5초 딜레이줌 
		try {
			System.out.println("잠시만 기다려 주시길 바랍니다.");
			Thread.sleep(5000);
		}catch (Exception e) {
			
		}
		
		while (x < total) {
//			사용자가 검토하는 아이디와 배열값(user2)에 있는 아이디가 같을경우
			if (userid.equals(user2.infodata[x][0])) {
				cnt++;
				
				//문자를 숫자로 변환
				point = Integer.valueOf(user2.infodata[x][4]);
			}

			x++;

		}

		if (cnt == 0) { // cnt 없으면 출력
			System.out.println("등록된 회원이 아닙니다.");

		}else { // 아이디 있을경우 출력
			// DecimalFormat : 숫자 자료형에 자동 콤마 기능을 적용함
			DecimalFormat df = new DecimalFormat("###,###");
			System.out.println("고객님의 포인트는:"+df.format(point)+"point 있습니다");
		}

	}

	@Override
	public String pointck(String userid) {

		return null;
	}

	@Override
	public void mytel(String usertel) {// 안씀

	}

	@Override
	public int dataea() {

		return user1.super.dataea();
	}

}