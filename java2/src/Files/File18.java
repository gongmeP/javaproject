package Files;

import java.io.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;


//Stream을 사용하고 나서 Buffered 사용 : read, write 단독으로 사용은 하지 않음

//read : int 형태 , 
//readLine : String 형태 

// InputStream > InputStramreder > BufferedReader (O)
// InputStream >  BufferedInputStram (O)
// InputStram > Buffered
public class File18 {

	public static void main(String[] args) {
		try {
//			OutputStreamWriter os = new OutputStreamWriter(System.out);
//			BufferedWriter bw = new BufferedWriter(os);
//			bw.write("홍길동");
//			bw.close();
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			
			int a = br.read();
			String test = br.readLine();
			System.out.println(test);
			
			//FileInputStream > BufferedInputStream
			//FileOutputStream > BufferedOutputStream
			
		}catch (Exception e) {
			
		}

	}

}
