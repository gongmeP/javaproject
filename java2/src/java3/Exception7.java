package java3;

import java.util.ArrayList;
import java.util.Arrays;

//예외처리로 발생하는 코드 테스트
//응용문제 . 데이터 파일{""}
//해당 데이터 값중 문자값만 출력 되도록 재 배열 하시길 바랍니다.
//메인에서는 해당 배열을 외부 클래스(setter) 전송
//setter 에서 배열값을 확인 후 이름만 재배열 
//getter 에서는 해당 배열을 return 으로 보냄, 외부 클래스에서 숫자만 있는 배열을 모두 예외처리
public class Exception7 {

	public static void main(String[] args) {
		Object data[] = { "김민수", 55, "김민재", 48, "이세현", "이수정", 34, 88 };
		try {

			set1 x = new set1(); // class 호출
			x.subset1(data); // setter 값 전달
			
			ArrayList<String> result = x.getter();
			System.out.println(result);
			
		} catch (Exception e) {
			if (e.getCause() != null) {
				System.out.println("error 발생");
			}
		}
	}

}

class set1 {
	ArrayList<String> redata = new ArrayList<>(); // 빈 배열 생성
	ArrayList<Integer> redata2 = new ArrayList<>();

	public void subset1(Object[] datas) throws Exception {
		
		
		int x = 0;
		int ea = datas.length;

		while (x < ea) {
			try { // 문자만 배열에 입력, 숫자 자료형 일 경우 예외처리
				String check = String.valueOf((String) datas[x]);
				System.out.println(check);
				this.redata.add(check);
			} catch (Exception e) { // 예외처리 발생
				int check2 = Integer.valueOf((int)datas[x]);
				this.redata2.add(check2);
			}
			x++;

		}
		System.out.println(redata); // 재 가공한 문자열
		System.out.println(redata2); // 재 가공한 숫자열

	}
	public ArrayList<String> getter(){
		
		return this.redata; // 가공 완료한거 메인으로 리턴
	}
}
