package java1;

public class scoring {

	// 배열값 및 사용자가 검색한 단어 인자값으로 받음
	public void sch(String data1[], String data2[], String data3) {

		int ea = data1.length;
		int x = 0;
		int cnt = 0;

		while (x < ea) {

			if (data1[x] == data3) { // 검색 단어와 배열값 비교
				System.out.printf("%s님의 점수는 %s 입니다.", data1[x], data2[x]);
				cnt++;

			}
			x++;
		}
		if (cnt == 0) { // 검색단어에 배열값이 없을경우
			System.out.println("미확인 되었습니다.");
		}

	}

}
