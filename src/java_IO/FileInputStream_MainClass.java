package java_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_MainClass {

	public static void main(String[] args) {

//		FileInputStream 클래스 : 파일의 정보를 읽어들이는 바이트 기반의 입력 스트림
		
//		
		try {
			
//			파일 지정
			File file = new File("\\devel\\storage", "test1.dat");
			
//			파일 입력 스트림 생성
			FileInputStream in = new FileInputStream(file);
			
//			파일 읽기
			int c; // 파일의 정보를 읽어와서 잠시 보관할 변수 c
			byte[] b = new byte[(int)file.length()]; //length 는 long타입이라 int로 형변환 필요 
			
			int i = 0; // 인덱스 선언
			
			while(true) {
				c = in.read(); // 모두 다 읽었을 때에는 c에는 -1값이 반환되어 저장된다.
				if(c == -1) { // 종료조건 만들기
					break;
				}
				b[i] = (byte)c;
				i++;
			}
			
			System.out.println(new String(b));
			
			
//			파일 입력 스트림 닫기
			in.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
