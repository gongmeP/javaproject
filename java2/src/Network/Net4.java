package Network;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//crawling 사용법
public class Net4 {

	public static void main(String[] args) {
		try {
			crowling2 cr = new crowling2();
			cr.creak2();
		}catch (Exception e) {
			
		}

	}

}

class crowling2{
	Scanner sc = null;
	String url = "";
	URL urls = null;
	InputStream is = null;
	BufferedInputStream bs = null;
	
	
	public void creak2() throws Exception{
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 url 주소를 입력하세요.(파일명 포함)");
		this.url = this.sc.nextLine(); // url 받음
		this.urls = new URL(this.url);//받은 url URL클래스로 저장
		URLConnection con = this.urls.openConnection(); // 저장된 url주소 연결
		this.is = this.urls.openStream(); // 저장된 url 주소 파일 오픈
		
		this.bs = new BufferedInputStream(this.is);
		byte[] code = new byte[1024];
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test.html");
		int z=0;
		while((z=this.bs.read(code))!=-1) {
			fs.write(code,0,z);
		}
		this.bs.close();
		fs.flush();
		fs.close();
		System.out.println("크롤링 완료되었습니다.");
	}
}



