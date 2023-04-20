package Network;

//멀티스레드 간편 코드 양식
public class Thread3 {

	public static void main(String[] args) {
	
		Thread t = new cpus(); 
		t.start();
		
		Runnable r = new amds();
		Thread t2 = new Thread(r);
		t2.start();
		
		
		int a = 1;
		int sum = 0;
		while(a <= 10) {
			sum += a;
			System.out.println(sum+" 1번 공장 데이터");
			a++;
		}
	}

}

//interface
class amds implements Runnable{
	@Override
	public void run() {
		int a = 1;
		int sum = 0;
		while(a <= 10) {
			sum += a;
			System.out.println(sum+" 3번 공장 데이터");
			a++;
		}
		
	}
}


//extends
class cpus extends Thread{
	@Override
	public void run() {
	
		int a = 1;
		int sum = 0;
		while(a <= 10) {
			sum += a;
			System.out.println(sum+" 2번 공장 데이터");
			a++;
		}
	}
}