package java1;

import java.text.SimpleDateFormat;
import java.util.*; // 모든 java.util에 있는 클래스를 로드함


public class index13 {

	//java : OOP (객체지향 언어), javascript : OOP 스크립팅 언어
	public static void main(String[] args) {
		//날짜 출력 형태
		Date today = new Date();
		System.out.println(today);
		
		// y 년 m 월 d 일 // 대소문자 다름.
		SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일");
		// H:시  m 분 s 초 // m M ap,pm 등 별도 구성
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss");
		
		SimpleDateFormat date2 = new SimpleDateFormat("hh:mm:ss a"); 
		//a : 오전 오후
		
		//format() : 규격화된 형태로 값을 표현
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		System.out.println(datetime.format(today));
		System.out.println(date2.format(today));
		

		
	}

}
