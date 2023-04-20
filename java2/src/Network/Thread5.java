package Network;

public class Thread5 {
//멀티 스레드를 이용하여 각각의 구구단을 출력하는 프로세스를 제작
	// 첫번째 스레드에는 구구단 5단 , 두번째에는 9단
	public static void main(String[] args) {
		
//		Runnable a1 = new dan1();
//		Thread as1 = new Thread(a1);
//		as1.start();
		
			Thread a1 = new dan1(); 
			Thread a2 = new dan2(); 
			a1.start();
			a2.start();					

	}

}

class dan1 extends Thread{
	
	@Override
	public void run() {
		int x = 5;
		int y = 1;
		int sum = 0;
		
		while(y<=100) {
			sum = x*y;
			System.out.printf("%d * %d = %d \n",x,y,sum);
			y++;
		}
	
		
	}
}

class dan2 extends Thread{
	@Override
	public void run() {
		
		int x = 9;
		int y = 1;
		int sum = 0;
		
		while(y<=100) {
			sum = x*y;
			System.out.printf("%d * %d = %d \n",x,y,sum);
			y++;
		}
	}
}
