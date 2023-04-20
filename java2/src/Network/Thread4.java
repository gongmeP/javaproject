package Network;

public class Thread4 {

	static int money = 50000; // 통장 잔고
	
	public static void main(String[] args) {

		Runnable ot = new outmoney();
		Thread ot2 = new Thread(ot);
		ot2.start();
		
		
		Runnable ra = new inmoney();
		Thread th = new Thread(ra);
		th.start();
		

	}

}

class outmoney implements Runnable{ //출금
	public void run() {
		int out[] = {15000,25000,16000};
		int w = 0;
		do {
			Thread4.money = Thread4.money - out[w];
			System.out.println("현재 잔고 금액은 " + Thread4.money + " 원 ");
			w++;
		}while(w < out.length);
	}
}



class inmoney implements Runnable{ 
	@Override
	public void run() {
		int plusmoney = 30000;
		Thread4.money = Thread4.money + plusmoney;
		System.out.println("현재 잔고 금액은 "+Thread4.money + " 원");
	}
	
}