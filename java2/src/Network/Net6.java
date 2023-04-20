package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Net6 {
	//Client 생성

	public static void main(String[] args) {

		try {
			System.out.println("Client connect");
			String ip = "192.168.10.105";
			int port = 9001;
			Socket sk = new Socket(ip,port);
			System.out.println("server in.");
			
			
			//클라에서 서버로 보내는 메세지
			String cmsg = "hi";
			
			//클라에서 서버로 보내는 통로 byte로 전송
			OutputStream os = sk.getOutputStream();
			
			os.write(cmsg.getBytes());
			os.flush();
			
			//서버에서 보낸 메세지를 클라가 받는 통로
			byte[] data = new byte[1024];
			InputStream is = sk.getInputStream();
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			sk.close();
			os.close();
			
		}catch (Exception e) {
			System.out.println("Error server connect");
		}
	}

}
