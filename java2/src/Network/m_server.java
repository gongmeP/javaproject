package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

//Thread를 이용한 멀티 채팅 서버
public class m_server {

	public static void main(String[] args) {
	
		chatroom cr = new chatroom();

	}

}

class chatroom{
	static final int port = 10001;
	ServerSocket sk ;
	Socket so ;
	
	
	public chatroom() {
		try {
			this.sk = new ServerSocket(this.port);
			System.out.println("***Chating***");
			while(true) {
				this.so = this.sk.accept();//클라 접속 허가
				
				
				Thread tr = new chat_thread(this.so); //accept
				tr.start();
			}
			}catch (Exception e) {
			System.out.println("Port Error!!");
			
		}
			
	}
	
}

class chat_thread extends Thread{
	InputStream ins;
	OutputStream outs;
	Scanner sc;
	private String msg = "";
	//배열을 메모리에 저장 시키는 이유는 접속자를 누적시키기 위해서 사용
	static ArrayList<Socket> user = new ArrayList<Socket>();
	
	public chat_thread(Socket s) {
		try {
			chat_thread.user.add(s);
			System.out.println("chatroom open");
			this.ins = s.getInputStream();
			this.outs = s.getOutputStream();
			System.out.println(this.user);
		}catch (Exception e) {
			System.out.println("Client Exit error!!");
		}
	}
	
	
	@Override
	public void run() {
		try {
			while(true) {
				byte data[] = new byte[1024];
				int n = this.ins.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
//				this.sc = new Scanner(System.in);
//				System.out.println("message : ");
				String result = this.msg;
				//한명이 입력한 내용을 접속한 모든 사용자에게 메세지를 전달하기 위함
				int f;
				for(f=0; f<this.user.size(); f++) {
					this.outs = this.user.get(f).getOutputStream();
					this.outs.write(result.getBytes());
					this.outs.flush();
				}
				//전송 끝
			}
			
		}catch (Exception e) {
			System.out.println("Client Success Exit");
		}
		
		
	}
}