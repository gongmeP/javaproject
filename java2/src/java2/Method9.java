package java2;

import java.util.Scanner;

//Method10 과 작업연계
public class Method9 {

	//main 메소드에서 직접 해당 배열을 사용하기 위해서 static(메모리)으로 등록
	static String msg[] = { "검색할 학생명을 입력해 주세요.", "검색할 과목명을 입력하세요[전체,국어,수학,과학,역사]" };

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Method10 mt = new Method10();
		System.out.println(msg[0]);
		String user = sc.next();
		System.out.println(msg[1]);
		String subject = sc.next();
		sc.close();
		mt.score(user,subject); // 10으로 전달
		
		
		String result = mt.gtdata(); // 10에서 받음
		
		if(subject.equals("전체")) {
			String score2[] = result.split(",");
			System.out.printf("국어:%s , 수학:%s , 과학:%s, 역사:%s",score2[0],score2[1],score2[2],score2[3]);
			
		}
		else{
			System.out.println(result);
		}
	}

}
