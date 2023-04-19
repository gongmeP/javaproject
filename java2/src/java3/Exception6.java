package java3;

public class Exception6 {

	//error : 값이 없을 경우
	//no : 아이디 중복 
	//yes : 사용가능한 아이디
	public static void main(String[] args) {
	
		idcheck id = new idcheck(); //아이디 처리하는 클래스
		
		
		try { // ajax로 front 에게 아이디값 받는 사항
		String callsing = id.id_result("hong");	//Ajax로 아이디 받는 사항
		System.out.println(callsing);
		}catch (Exception e) { // idcheck 클래스에서 오류 발생시 
			if(e.getMessage() != null) {
				System.out.println(e); // 메세지출력
			}
		}

	}

}
class idcheck {
	//아이디 중복 검토 확인
	public String id_result(String mid) throws Exception {
		String call = "";
		//front 에게 출력해주는 메세지 변수
		if(mid == null || mid.equals("")) { //아이디가 비어잇을경우
			throw new Exception("error"); // 예외처리 발생
		}else { // front가 아이디를 정상적으로 발송 했을경우
			if(mid.equals("hong")) { // 동일한 아이디가 있을 경우
				call = "no";
			}else { // 동일한 아이디가 없을 경우 
				call = "yes";
			}
		}
		return call; // 최종 결과값
		
	}
}
