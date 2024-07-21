package java_IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_MainClass {

	public static void main(String[] args) {

//		PrintWriter 클래스 : print(), println(), printf() 메소드를 지원하는 문자 출력 스트림
		
		
//		디렉터리 지정
		File dir = new File("\\devel\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
//		파일 지정
		File file = new File(dir, "tesx3.txt");
		
		try(PrintWriter writer = new PrintWriter(file)) {
			
//			데이터 내보내기
			writer.println("안녕하세요");
			writer.println("반갑습니다");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
