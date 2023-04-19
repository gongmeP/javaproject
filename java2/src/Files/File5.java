package Files;

import java.io.FileWriter;
import java.util.Scanner;

public class File5 {
//user.txt 라는 파일에 다음과 같이 저장 되도록 코드를 작성하시오.
//	사용자 아이디를 입력하세요
//	총 5번의 질문을 물어보며 , 사용자가 직접 입력합니다.
//	사용자가 입력한 내용은 user.txt에 남아있어야합니다.
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		

		FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\Files\\user.txt"); 
		//true . 반복문 안에서는 누적 시키기 위해 필요함
		
		int y = 0;
		while(y < 5) {
			System.out.println("사용자 아이디를 입력하세요");
			String x = sc.nextLine();
			fw.write("{userid"+(y+1)+":"+(String)x+"},\n");
			y++;
		}
		System.out.println("입력완료");
		fw.close();
		sc.close();

	}

}
