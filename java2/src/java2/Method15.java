package java2;

public class Method15 {
//Override규칙
	public static void main(String[] args) {
		

	}

}

class color1{
	public String abc() {
		return null;
	}
	public boolean zzz(int nm, String abc) {
		
		return true;
	}
}
class color2 extends color1{
	public void zzz() { // color2에서 생성된 메소드
		
	}
	
	@Override
	public String abc() {
		
		return super.abc();
	}
	
	@Override 
	// 위에 zzz메소드랑 다름.
	public boolean zzz(int aaaa, String ccc) { //color1 zzz메소드에서 int로 적용했으니 여기도 int로 Override 
		// 원판 class 메소드를 따라가야함 , 인자명은 달라도됨
		              
		return super.zzz(aaaa,ccc);
	}
}