package java_Natwork;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoder_MainClass {

	public static void main(String[] args) {

//		URLEncoder 클래스 : 인코딩(암호화)할 때 사용
//		URLDecoder 클래스 : 디코딩(복호화)할 때 사용
		
//		https://www.google.com/search?q=%EA%B2%80%EC%83%89%EC%96%B4&newwindow=1&sca_esv=fd72789be247385b&sxsrf=ADLYWIJ8sfg-m3ANg3gRgfEpsdvLbpH0iw%3A1721283015935&ei=x7GYZq_gOIvL0-kPmOqOmAw&ved=0ahUKEwjv3-P19q-HAxWL5TQHHRi1A8MQ4dUDCA8&uact=5&oq=%EA%B2%80%EC%83%89%EC%96%B4&gs_lp=Egxnd3Mtd2l6LXNlcnAiCeqygOyDieyWtDIFEAAYgAQyBRAuGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgARI-BtQ_QRY4xlwAngBkAEEmAGmAaABkA6qAQQwLjE0uAEDyAEA-AEBmAIHoAKcBagCCsICChAAGLADGNYEGEfCAgoQIxiABBgnGIoFwgIEEAAYHsICBxAjGCcY6gLCAgcQLhgnGOoCwgIEECMYJ8ICCxAAGIAEGLEDGIMBwgIREC4YgAQYsQMY0QMYgwEYxwHCAgQQABgDwgILEC4YgAQYsQMYgwHCAggQABiABBixA5gDBIgGAZAGApIHAzIuNaAHqXY&sclient=gws-wiz-serp
//		%EA%B2%80%EC%83%89%EC%96%B4 -> 검색어 라는 글자가 인코딩된 것
		
		try {
			
			String spec = "https://www.google.com/search";
			
			String query =  URLEncoder.encode("검색어", "UTF-8"); // UTF-8 : 인코딩 방식
			
			spec += "?q=" + query;
			
			System.out.println(spec);
			
			System.out.println(URLDecoder.decode(query, "UTF-8"));
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
