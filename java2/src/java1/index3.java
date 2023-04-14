package java1;

public class index3 {

	public static void main(String[] args) {
	
		//if문
		//+-*/ 사칙연산가능
		int a,b;
		a=10;
		b=20;
		
		if(a<b) {
			System.out.println("b값이 큽니다");
		}else if (a > b) {
			System.out.println("a값이 큽니다.");
			
		}else {
			System.out.println("두값이 같습니다.");
		}
		
		
		//응용문제1.
		//1번항목은 숫자 10,9,22 이며
		//2번항목은 19,10,2 
		// 첫번째 두번째 숫자를 더하며, 세번째 숫자는 곱할경우 의 결과값이 작은 항목이 출력되도록
		
//		int a1,b1,c1,a2,b2,c2,a3,b3,c3;
//		a1=10;
//		b1=9;
//	    c1=22;
//	    a2=19;
//	    b2=10;
//	    c2=2;
//	    a3 = a1+(b1*c1);
//	    b3 = a2+(b2*c2);
//	    if(a3 < b3) {
//	    	System.out.println("1번항목이 작아용");
//	    }
//	    else if(a3> b3) {
//	    	System.out.println("2번항목이 작아용");
//	    }else {
//	    	System.out.println("값 같음");
//	    }
	    
	    
	    String userid = "hong";
	    String userpw = "a123456";
	    if(userid == "hong" && userpw == "a123456") {
	    	System.out.println("로그인되셨습니다.");
	    }else {
	    	System.out.println("아이디 및 패스워드를 확인하세요");
	    }
	    
	    int a1 = 100;
	    double a2 = a1 / (double)3;
	    System.out.println(a2);
	    
	    //Integet:매개체에 대한 속성.toString()문자열 변환
        //.parseInt() 또는 valueOf()  문자를 숫자로 변환	    
	    //숫자를 문자로 변환하여 출력하는경우
	    int b1 = 500;
	    String b2 = Integer.toString(b1);
	    System.out.println(b2);
	    
	    //문자를 숫자로 변환
	    String c1 = "600";
	    int d1 = 10;
//	    int sum = Integer.valueOf(c1) + d1 ;
	    int sum = Integer.parseInt(c1) + d1;
	    
	    System.out.println(sum);
	    
	    //증가,감소
	    int z = 10 ;
	    z++;
//	    z--;
	    System.out.println(z);
	    
	    //+=, *= -= /= 
	    int k = 50 ;
	    k += k;
	    System.out.println(k);
	    
	    //간단 문자 표현 (char / ' '  만 먹힘 )
	    char f = 'H';
	    System.out.println(f);
	    
	}

}
