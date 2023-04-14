package java1;

import java.util.Scanner;

public class index9 {

	public static void main(String[] args) {
		//한줄 이상 입력 관련 및 공백
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("두개의 숫자를 입력하세요");
	    //nextInt,next : 스페이스바를 이용하여 2개의 숫자 or 문자 입력가능 .
	    // 엔터를 이용하여 2개의 숫자를 입력가능
	    int a = sc.nextInt(); 
	    int b = sc.nextInt();
	    
	    System.out.printf("\n첫번째 숫자 %d, 두번째 숫자 %d",a,b);
	    
	    System.out.println("두명의 이름을 입력하세요");
	    String c = sc.next() ;
	    String d = sc.next() ;
	    System.out.printf("\n첫번째 이름 : %s, 두번째 이름 %s",c,d);
	    
	    
	    
	 // sc 라는 객체는 이미 nextInt 와 next 로 사용해서 nextLine 사용 불가
	    // sc2 로 새로운 객채 생성
	    //nextLine : 스페이스바는 그냥 공백으로 인식
	    Scanner sc2 = new Scanner(System.in); 
	    System.out.println("\n주소를 입력하세요");
	    String e = sc2.nextLine();
	    System.out.println("주소:" + e);
	    
	    
	    sc.close();
	    sc2.close();

	}

}
