package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net5 {
 
	//socekt 통신 : server , client 양방향 통신
	//http 통신 : image , 동영상 , 음악 등 사용자 요청에 맞춰서 송수신 통신(단방향)
	
	//양방향 : 자동 업데이트 
	public static void main(String[] args) {
	
		System.out.println("Server Connect");
		int port = 9002; //포트번호 셋팅
		try {
			ServerSocket ss = new ServerSocket(port); // 오픈시킬 포트를 적용
			while(true) {
				System.out.println("connecting ...");
				Socket sc = ss.accept(); // accept : 클라이언트가 접속하는것을 대기하는 역할을 하게됨
				System.out.println("host connect");
				
				//서버에서 클라이언트로 받는 통로
				InputStream is = sc.getInputStream();
				
				//클라로 보내는 통로
				OutputStream os = sc.getOutputStream();
				byte data[] = new byte[1024]; //클라에서 받는 텍스트를 byte로 받음
				int n = is.read(data); //해당 값을 읽어들임
				
				//문자 자료형으로 변환
				String magclient = new String(data,0,n);
				//출력
				
				//클라이언트로 메세지 전송
				System.out.println(magclient);
				String aws = "hi client"; //서버에서 클라에게 보내는 메세지
				os.write(aws.getBytes()); // 클라로 보내기 위한 메모리 저장
				os.flush();
				os.close();
				is.close();
				sc.close();
				
			}
		}catch (Exception e) {
			System.out.println("Server Connect error!!");
		}

	}

}
//javac 파일.java 컴파일
//java 파일.java 실행
//
//cmd 통신실행 포트 설정  
//netstat -an 실행시 통신 포트 활성화 확인
//포트가 물려있으면 정지 
//netstat -a -o : kill번호 확인
//taskkill /f /pid 번호
