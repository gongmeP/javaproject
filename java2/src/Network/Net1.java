package Network;

import java.net.InetAddress;

public class Net1 {
//ipv4 ipv6 localhost tcp udp
	public static void main(String[] args) {
		
		try{ 
			//InetAddress : IPnetworkAdress 를 말함
			//getByname : 접속할 도메인 주소명
			//getHostAddress : 접속하는 서버의 IP 주소
			
		InetAddress ia = InetAddress.getByName("localhost");
		String domain = ia.getHostAddress();
		System.out.println(domain);
//		String ip = ia.getHostAddress();
//		System.out.println(ip);
		
		//getAllByName : 배열로 처리하는 형태
		InetAddress ia2[] = InetAddress.getAllByName("naver.com");
		System.out.println(ia2.length);
		int w = 0;
		while(w < ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
