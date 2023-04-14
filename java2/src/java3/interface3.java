package java3;

public class interface3 {

	// user1.java user2.java 응용
	public static void main(String[] args) {

		// 응용문제2
		// 가입된 모든 사용자의 정보를 출력.
		// 아이디 : hong 고객명 : 홍길동 , 이메일 : asdsadsa@adsda 지역 : ㅇㅇ

		members ui = new members();
		ui.myinfo("");

	}

}

class members implements user1 { 
	// user2 인터페이스는 로드하지않음 / user2 필드 변수명은 메모리에 저장되기떄문에 별도로 호출가능
	

	@Override
	public void myinfo(String userid) {

		Integer total1 = dataea();

		int x = 0;
		while (x < total1) {

			
			System.out.printf("아이디 : %s / 고객명 : %s / 이메일 : %s / 지역 : %s \n",
					userdata[x][0],
					userdata[x][1],
					userdata[x][2],
					user2.infodata[x][2]);
			x++;
		}

	}

	@Override
	public void mytel(String usertel) {
		// TODO Auto-generated method stub

	}



}