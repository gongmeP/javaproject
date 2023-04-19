package Network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.Scanner;

public class Net2 {
	// tcp
// 80 : web http
//	443 : web https
//	21 : ftp
//	22 : ssh
//	23 : Telnet
//	25 : SMTP (메일 보내기)
//	110 : POP (매일받기) - 서버와 비동기화
//	143 : IMAP (메일받기) - 서버와 동기화

	// udp
//	snmp : 문자발송시스템
//	vpn : 가상아이피 
//	https://img.hankyung.com/photo/202109/01.27368686.1.jpg
	public static void main(String[] args) {

		try {
			getimage gi = new getimage();
			gi.img();
		} catch (Exception e) {
			System.out.println("통신 오류 발생");
		}

	}

}

class getimage {
	Scanner sc = null;
	InputStream is = null;
	BufferedInputStream bi = null;
	FileOutputStream fos = null;

	public void img() throws Exception {
		this.sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해주세요");
		String url = sc.nextLine();
		URL u = new URL(url); //url(클래스) : 네트워크 경로를 말합니다.(절대경로 형태로 적용)
		URLConnection con = u.openConnection();//해당 경로를 연결하는것을 말함
		System.out.println(con);

		int imgsize = con.getContentLength(); // 이미지 사이즈
		System.out.println(imgsize);

		String imgtype = con.getContentType(); //이미지 타입형태
		System.out.println(imgtype);
		
		long date = con.getDate(); // 업로드 날짜
		System.out.println(date);
		
		
		this.is = u.openStream(); //통신에선 openStram
		this.bi = new BufferedInputStream(this.is); //이미지 파일을 임시로 메모리에 저장
		byte data[] = new byte[1024]; // 1kb = 1024 해당 파일을 조각냄
		
		Date today = new Date();
		String filename = today.getDate()+""+today.getTime()+".png";
		System.out.println(filename);
		
		//해당 경로에 저장
		this.fos = new FileOutputStream("E:\\memo\\"+filename);
		int imgdata = 0;
		int cnt = 0;
		while((imgdata=this.bi.read(data))!=-1) {
			this.fos.write(data,0,imgdata); // 조각난 파일을 취합하여 저장
			
			cnt+= imgdata;
			System.out.println("다운로드 중..."+(cnt*100)/imgsize+"%");
			
		}
		System.out.println("다운로드 완료되었습니다.");
		this.fos.flush(); //메모리 비움
		this.fos.close();
		this.sc.close();
		this.bi.close();
		this.is.close();
	}
}
