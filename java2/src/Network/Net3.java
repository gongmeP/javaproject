package Network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//crawling 사용법
public class Net3 {

	public static void main(String[] args) {
		try {
			crowling cr = new crowling();
			cr.creak();
		}catch (Exception e) {
			
		}

	}

}

class crowling{
	Scanner sc = null;
	String url = "";
	URL urls = null;
	InputStream is = null;
	InputStreamReader ir = null;
	
	public void creak() throws Exception{
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 url 주소를 입력하세요.(파일명 포함)");
		this.url = this.sc.nextLine(); // url 받음
		
		this.urls = new URL(this.url);//받은 url URL클래스로 저장
		
		URLConnection con = this.urls.openConnection(); // 저장된 url주소 연결
		
		this.is = this.urls.openStream(); // 저장된 url 주소 파일 오픈
		//통신에는 openStream만 사용합니다.
		
		this.ir = new InputStreamReader(this.is); // url 소스파일 읽음
		BufferedReader br = new BufferedReader(this.ir); // 버퍼로 메모리에 저장
	
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test.html");//경로에 파일 생성
	
		PrintWriter pw = new PrintWriter(fs); //출력을 문자화 하여 사용
		String code = "";
		
		while((code=br.readLine())!=null) { //code 에 br.readLine()내용을 받고, 내용이 있으면 밑에서 pw에 저장
			pw.write(code); // pw에 String 문자화 형태로 내용저장 / pw의 경로는 fs
		}
		System.out.println(pw);
		System.out.println("크롤링완료");
	}
}



