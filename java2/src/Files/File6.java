package Files;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//Scanner + FileReader 응용
public class File6 {

	public static void main(String[] args) {
		notice n = new notice();
		try {
			
			n.view();
		}catch (Exception e) {
			System.out.println("메소드 함수 오류");
		}

	}

}

class notice{
	FileReader frs = null;
	Scanner sc = null;
	public void view() throws Exception {
		this.frs = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
		
		//해당 Scanner에 파일 내용을 모두 적용시킴
		//System.in : 직접입력
		//System.out : 출력파트
		this.sc = new Scanner(this.frs);
		System.out.println(this.sc.hasNext());
		
		while(this.sc.hasNext()) { // 파일에 사용된 라인갯수만큼 반복 4번째 라인일땐 false가 되기때문에 루프안돔
			
			System.out.println(this.sc.nextLine());
		}
		this.frs.close();
		this.sc.close();
		
	}
}