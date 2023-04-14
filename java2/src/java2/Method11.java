package java2;

public class Method11 {

	public static void main(String[] args) {
		student st = new student();
		st.info("홍길동", "30");
		st.print();
		

	}

}

class pserson{
	protected String name; // 같은 클래스,패키지 및 상속클래스는 접근이 가능. 외부클래스는 접근 안됨
	protected String age;
	//setter
	public void info(String name, String age) {
		
		this.name = name;
		this.age = age;
	}
	public void print() { //print 메소드 생성
		System.out.println("고객명 : "+this.name);
		
	}
	
}
class student extends pserson{
	
	@Override // 동일한 이름과 인자값을 가진 메소드를 표시
	public void print() {
		super.print(); // 상속받는 메소드를 정의함
		System.out.println("나이는:"+this.age);
	}
	
	
}




