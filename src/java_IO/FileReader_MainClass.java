package java_IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_MainClass {

	public static void main(String[] args) {

//		FileReader 클래스 : 텍스트 파일을 읽어들이는 문자 기반 입력 스트림
		
//		파일지정
		File file = new File("\\devel\\storage", "test1.txt");
	
		StringBuilder sb = new StringBuilder(); 
		
//		try - catch - resources
		try(FileReader reader = new FileReader(file)) {
			
			int ch;
			
			while((ch = reader.read()) != -1) {
				sb.append((char)ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 System.out.println(sb.toString());
	}

}
