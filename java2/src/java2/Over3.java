package java2;

public class Over3 {

	// 응용문제4 각 통신사별 인원수 현황을 출력하는 프로세서를 개발하시오
	// SKT 1명 KT:2명 LGT :1명

	// 메인 실행 // class:Over1 , method:userlist (String)
	public static void main(String[] args) {
		abc m1 = new abc();
		m1.userlist("");

	}

}

class abc extends Over1 {
	int ea1;

	@Override
	void userlist(String username) {

		super.userlist(username);
		this.ea1 = this.list.length;
		int sktcnt = 0;
		int ktcnt = 0;
		int lgtcnt = 0;
		int x1 = 0;
		while (x1 < ea1) {
			if (this.list[x1][4].equals("SKT")) {
				sktcnt++;

			} else if (this.list[x1][4].equals("LGT")) {
				lgtcnt++;
			} else if (this.list[x1][4].equals("KT")) {
				ktcnt++;
			}

			x1++;
		}
		System.out.printf("SKT : %d명 \nKT : %d명 \nLGT : %d명", sktcnt, ktcnt, lgtcnt);
	}
}
