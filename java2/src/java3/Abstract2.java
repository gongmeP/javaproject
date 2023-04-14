package java3;


public class Abstract2 {

	public static void main(String[] args) {
		box3 b = new box3();
		b.idck("hong");
		b.result();

	}

}
//abstract(추상): 상속을 강제하는 일종의 규제, 법칙을 제공하는 클래스
//추상 클래스를 상속하면 무조건 추상클래스 안에 있는 메소드를 오버라이드 해야함

//추상 extends로 받아서 안에 모든메소드 걍 갖다쓰는거 팀프시 뼈대 제공

/*
 추상클래스 법칙
 1. main에서 추상 메소드를 직접 핸들링 할 수 없음. 
 2. 상속 위주로 사용
 3. 추상클래스에  별도의 코드를 작성하지 않음(if, for)
 4. 필드에 변수를 선언 및 값을 적용할 수 있음
 5. 추상 클래스 안에 실제 메소드를 생성시 오버라이드 안해도됨 (ab1에 ab_1)
 6. 추상 클래스는 직접 실행이 안됨
 7. 추상 클래스는 추가 상속이 가능함
 */

//ab1연동
class box3 extends ab1 {

	
	@Override
	public void idck(String id) {
		System.out.println(id);

	}

	@Override
	public String loginck() {

		return null;
	}
	
	@Override
	public void result() {
	System.out.println(this.aa1);
		
	}
	
	@Override 
	public void ab_1() { // abstract 선언을 안해서 오버라이드 안해도되는 메소드
		
		super.ab_1();
	}

}



class box5 extends ab1{ // 여러번 상속 가능
	@Override
	public void idck(String id) {
				
	}
	@Override
	public String loginck() {
		
		return null;
	}
	@Override
	public void result() {
	
	}
}



class box4 extends aa{
	@Override
	public int password() {
		
		return 0;
	}
}
