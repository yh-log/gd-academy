package java_Natwork;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
다음에서 제시하는 URL의 정보를 출력하시오.

http://gdu.co.kr:80?name=java 인 url 정보에서
프로토콜, 호스트, 포트번호, 파라미터 정보를 추출하여 순서대로 출력하는 프로그램을 작성하시오.

[결과]
http
gdu.co.kr
80
name=java
*/

public class Ex02_URL {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		String apiURL = "http://gdu.co.kr:80?name=java";
		
		try {
			
			URL url = new URL(apiURL);
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getQuery());
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
