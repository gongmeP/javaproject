package java2;

import java.util.Arrays;
import java.util.Scanner;

public class Over2 {

	//메인 실행 // class:Over1 , method:userlist (String)
	public static void main(String[] args) {
		myinfo m = new myinfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 이름 검색");
		String nm = sc.next();
		m.userlist(nm);

	}

}

class myinfo extends Over1{
	int money2 ; // 추가변수
	int ea;
	
	@Override
	public void userlist(String username) {
		
		super.userlist(username);
//		System.out.println(Arrays.toString(this.list[0]));
//		System.out.println(this.se);
//		this.money = 1000; // 추가 코드 
//		this.money2 = 2000; // 추가 변수에 대한 추가코드
//		System.out.println(this.money);
//		System.out.println(this.money2);
		
		this.ea = this.list.length; //배열 갯수 를 ea 로
		System.out.println(ea);
		
		int x = 0;
		while(x < this.ea) {
			
			if(this.list[x][0].equals(username)) {

				System.out.println(Arrays.toString(this.list[x]));
				break;
			}
			
			
			
			x++;
		}
	}
}