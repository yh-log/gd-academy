package java_Natwork;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
문자열을 UTF-8 방식으로 인코딩하여 출력하시오
*/

public class Ex04_URLEncoder {

	public static void main(String[] args) {

		exam();
		exam2();
		
	}
	
	public static void exam() {
		String orgData = "구디아카데미-Java 과정";
		
		try {
			
			String spec = URLEncoder.encode(orgData, "UTF-8");
			
			System.out.println(orgData);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public static void exam2() {
		String orgDate = "구디아카데미-Java 과정";
		
			
			byte[] b = orgDate.getBytes(StandardCharsets.UTF_8);
			
			System.out.println(b);
	}

	
//	정답 풀이
	public static void exam3() {
		String orgData = "구디아카데미-Java 과정";

		try {
            System.out.println(URLEncoder.encode(orgData, "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}
