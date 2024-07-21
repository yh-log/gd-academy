package java_IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_MainClass {

	public static void main(String[] args) {

//		BufferedInputStream 클래스 : 버퍼링된 데이터를 읽는 바이트 입력 스트림
		
//		파일 지정
		File file = new File("\\devel\\storage", "test2.dat");
		
		try {
			
//			버퍼 입력 스트림 생성 (보조 스트림이기 때문에 메인(파일)이 필요하다.)
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			
//			파일 읽기 (한 번에 한 바이트씩 읽기)
			int c;
			byte[] b = new byte[(int)file.length()];
			
			int i = 0;
			
			while(true) {
				c = in.read();
				if(c == -1) {
					break;
				}
				b[i] = (byte)c;
				i++;
			}
			
			System.out.println(new String(b));
			
//			버퍼 입력 스트림 닫기
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
