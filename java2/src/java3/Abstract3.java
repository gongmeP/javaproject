package java3;

public class Abstract3 {

	public static void main(String[] args) {
		

	}

}

class ab3 extends aa{
	@Override
	public int password() {
		
		return 0;
	}
}


//aa2 에서 aa extends 받고
//aa2 상속받고 외부 클래스에서 로드 시 aa aa2 두개의 메소드를 모두 오버라이드 해야함
class ab4 extends aa2{
	@Override
	public String user_info() {
		
		return null;
	}
	@Override
	public int password() {
		
		return 0;
	}
}






//일반 클래스 메소드는 super 있음
class ab5 extends aa3{
	@Override
	public int aa3_method() {
		
		return super.aa3_method();
	}
}
