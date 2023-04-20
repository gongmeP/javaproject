package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {

	// 채팅 클라
	public static void main(String[] args) {
		chat_cl ch = new chat_cl();
		ch.chatclient();
	}

}

class chat_cl {
	private String ip = "192.168.10.105";
	private int port = 10001;

	Socket so;
	Scanner sc;
	InputStream ins;
	OutputStream outs;

	private String mid = "";
	private String msg = "";

	String cms="";
	public void chatclient() {

		try {
			this.sc = new Scanner(System.in);
			System.out.println("login id : ");
			this.mid = this.sc.nextLine();
			int cnt = 0;
			while (true) {
			
				this.so = new Socket(this.ip, this.port);
				this.ins = this.so.getInputStream(); // 서버에서 받아오는 메세지
				this.outs = this.so.getOutputStream(); // 서버에서 보내는 메세지
				
				
				//최초 서버에 접속했을때 발생하는 메세지
				if (cnt == 0) {
					this.msg = "[" + this.mid + "] Go in ";
					this.outs.write(this.msg.getBytes()); // 여기서 메세지 보냄
					this.outs.flush();
				} 
				else {
					this.sc = new Scanner(System.in);
					System.out.println("message : ");
					this.cms = this.sc.nextLine();
				}
				
				
				
				if (this.cms.equals("exit")) { // 종료선언하면 발동
					this.msg = "chatroom out";						
					//서버로 전송하는 메세지코드
					this.outs.write(this.msg.getBytes()); // 여기서 메세지 보냄
					this.outs.flush();
					this.ins.close();
					this.outs.close();
					this.sc.close();
					break;
				} 
			   else { // 종료 선언 아닐때 메세지 전송
					this.msg = "[" + this.mid + "]" + this.cms;
					this.outs.write(this.msg.getBytes()); // 여기서 메세지 보냄
					this.outs.flush();						
				}
				

				//서버에서 메세지를 받는 코드
				byte msg[] = new byte[1024];
				int n = this.ins.read(msg);
				String servertext = new String(msg, 0, n);
				System.out.println(servertext);
				
				cnt++;
			}
		}
		 catch (Exception e) {
			System.out.println("Server Connect Error!!");
		}

	}
}
