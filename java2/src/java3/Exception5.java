package java3;

public class Exception5 {

	public static void main(String[] args) {
		ex2 ex = new ex2();
		try {
			ex.loader("ok");
		}catch (Exception ee) {
			if(ee.getMessage()!=null) {
				System.out.println(ee);
			}
		}

	}

}
class ex2{
	
	public void loader(String a) throws Exception {
		//해당 메소드에서 오류가 발생시 모든 내용이 자신을 호출한 본 class에게
		//전달 되어 집니다.
		//자신에 문제사항을 직접 확인 하는 방법은 자신의 메소드에도 try~catch를 사용해야만 알수있음
		try {
			if(a == "ok") {
				String data = "1,000";
				int money = Integer.valueOf(data);
			}
			else {
				System.out.println("데이터가 잘못 전달됨");
			}
		}catch (Exception e) { // money가 숫자로 변환 실패일 경우 코드에 문자가 어떤것이 발생했는지 확인 후 리턴
			System.out.println(e.getMessage());
			Exception ep = new Exception();
			throw ep;
			
		}
		
	}
}
