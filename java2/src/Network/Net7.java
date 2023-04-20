package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Net7 {

	public static void main(String[] args) {
		String ip = "192.168.10.105";
		int port = 9001;
		
		try {
			chat ch = new chat();
			ch.server_connect(ip, port);
		}catch (Exception e) {
			System.out.println("Server Error!!");
		}

	}

}
class chat{
	Scanner sc = null;
	
	//클라와 서버 모두 공용으로 사용하느 클래스
	Socket sk = null;
	OutputStream os = null;
	InputStream is = null;
	public void server_connect(String ip, int port) throws Exception{
		
		this.sk = new Socket(ip,port); //상대방 아이피 / 포트번호
		System.out.println("ok!!"); // 완료표시
		this.os = this.sk.getOutputStream(); //서버로 값을 보내는 사항
		this.is = this.sk.getInputStream(); // 서버에서 값을 받을때 사용 
		this.sc = new Scanner(System.in);
		
	
			
		System.out.println("message:");
		String msg = this.sc.nextLine();
		String username = "apink : ";
		String chats = username + msg;
			
		this.os.write(chats.getBytes()); //os.write로 getBytes 전송
		this.os.flush(); // 메모리값초기화
		this.os.close();
		
		
		
	}
}
