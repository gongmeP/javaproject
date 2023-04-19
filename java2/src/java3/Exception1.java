package java3;

//예외처리 : I/O / 사용시 무조건 필수로 적용하게 됩니다.
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try { // (1) : 해당 변수값을 숫자로 자료형 변환 요청
			a = Integer.valueOf(b); // 문자 a로 인하여 오류 발생

			// try에서 오루 발생시 해당 문법은 작동하지 않음
			int sum = 10+20;
			System.out.println(sum);
		} catch (Exception e) { // (2) : 오류 발생시 실행 되는 문법
			System.out.println("숫자로 변환 되지 않습니다.");
			//(3) 어떤 부분에서 문제가 발생하는지를 체크
		    
		}
		finally { //(4) try에서 문제가 발생한 사항을 수정 후 재실행
			b = b.replaceAll("[a-zA-Z]",""); //(문자제거)
			
			a=Integer.valueOf(b); //(5) 숫자로 변환
		
		}
		System.out.println(a); // 최종값 출력

	}

}
