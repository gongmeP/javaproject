package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//Thread를 이용한 멀티 채팅 클라
public class m_client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user id : ");
		String mid = sc.nextLine().intern();
		if(mid == "") {
			System.out.println("id error");
		}else {
			
			m_chat m = new m_chat(mid);
		}

	}


}

class m_chat{
	private String ip = "192.168.10.105";
	private int port = 10001;

	Socket so;
	Scanner sc;
	InputStream ins;
	OutputStream outs;

	private String msg = "";

	
	public m_chat(String id) {
		try {
			this.outs = this.so.getOutputStream();
			this.msg = "WELCOME  " + id;
			this.outs.write(this.msg.getBytes());
			this.outs.flush();
			
			while(true) {
				this.so = new Socket(this.ip,this.port);
				this.ins = this.so.getInputStream();
//
//				byte data[] = new byte[1024];
//				int n = this.ins.read(data);
//				this.msg = new String(data,0,n);
//				System.out.println(this.msg);

				
				this.sc = new Scanner(System.in);
				System.out.println("chat : ");
				this.msg = this.sc.nextLine();
				this.outs.write(this.msg.getBytes());
				this.outs.flush();
					

			}
			
			
		}catch (Exception e) {
			System.out.println("server connect error");
		}
		
	}
}
