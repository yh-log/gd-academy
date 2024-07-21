package java_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_MainClass {
	
	
//	바이트 입력 스트림으로 문자 읽기 (byte[] 배열을 사용하면 정상적으로 출력은 가능)
	public static void method1() {
		
//		파일 지정
		File file = new File("\\devel\\storage", "tesx3.txt");
		
		StringBuilder sb = new StringBuilder();
		
		try(FileInputStream in = new FileInputStream(file)) { // 바이트 단위로 읽기 때문에 FileInputStream 사용
			
			int c;
			
			while((c = in.read()) != -1) {
				sb.append((char)c);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
	}

	
//	InputStreamReader 클래스 : 바이트 입력 스트림 -> 문자 입력 스트림으로 변환
	public static void method2() {
		
		File file = new File("\\devel\\storage", "tesx3.txt");
		
		StringBuilder sb = new StringBuilder();
		
		try(InputStreamReader reader = new InputStreamReader(new FileInputStream(file))) { // 원할경우 성능 향상을 위해 버퍼드리더와도 함께 사용 가능
			
			int c;
			while((c = reader.read()) != -1) {
				sb.append((char)c);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
		
	}
	
	public static void main(String[] args) {

//		method1();
		method2();
		
	}

}
