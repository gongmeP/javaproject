package java3;

public class List7 {

	//메모리 : stack : cpu 캐시메모리(작음) ,  Heap : 실제 메모리  (메모리 제한 없음)
	static int box2 = 20;
	public static void main(String[] args) {
		int box1 = 20; //Stack         20
		Integer box3 = 20; //Stack      0x0002
		Integer box4 = new Integer(20); // Heap 영역  20(0x0002)
		Integer box5 = 20;
		
		Integer box6[] = new Integer[5];
		
		if(box1 == box3) {
			System.out.println("동일함");
			
		}
		if(box3 == box4) {
			System.out.println("동일함");
			
		}
		if(box3.equals(box4)) {
			System.out.println("동일함2");
		}
		
		if(box1==box4) {
			System.out.println("동일함3");
		}
		
		if(box3.equals(box5)) {
			System.out.println("동일함4");
		}
		

	}

}
