package java_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_MainCalss {

	public static void main(String[] args) {

//		BufferedReader 클래스 : 버퍼링된 문자를 읽는 문자 입력 스트림
//			-> 버퍼링으로 속도가 향상되고 readLine() 을 사용할 수 있다는 장점이 있다.
		
//		파일 지정
		File file = new File("\\devel\\storage", "test2.txt");
		
		StringBuilder sb = new StringBuilder(); // 문자열을 더할 때 유용한 메소드
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
//			BufferedReader 클래스가 제공하는 입력 메소드 : readLine() -> 한 줄씩 읽는다.
//			String str = reader.readLine(); // 원본 파일의 줄바꿈은 포함하지 않고 출력된다. 
//			System.out.println(str);
//			System.out.println(str.length());

			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				
				sb.append(str).append("\n"); // 줄바꿈을 넣지 않으면 한줄로 나온다.
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
	}

}
