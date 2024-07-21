package java_Natwork;

import java.net.MalformedURLException;
import java.net.URL;

public class URLClass_MainClass {

	public static void main(String[] args) {

//		URL 클래스 : URL 처리를 위한 클래스
		
//		접속 주소
		String spec = "https://www.example.com:9090/board/view.html?no=1&week=sun#footnote";
		
//		접속 주소가 맞을 때 아닐 때는 위해 예외처리 필요
		try {
			
			URL url = new URL(spec);
			System.out.println(url.getProtocol()); // 프로토콜 확인
			System.out.println(url.getDefaultPort()); // 포트번호 확인
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getFile()); // 패스와 쿼리가 같이 나옴 ? ~ # 까지
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}

}
