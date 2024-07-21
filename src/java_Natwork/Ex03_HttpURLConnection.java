package java_Natwork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#toppage
이미지 크리를 계산하여 출력하시오
*/

public class Ex03_HttpURLConnection {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		String spec = "https://gdu.co.kr/images/main/logo.png";
		
		try {
			
			URL url = new URL(spec);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			int responsdCode = con.getResponseCode(); // 응답 코드를 얻기 위한 메소드
			
			if(responsdCode != HttpURLConnection.HTTP_OK) {
				System.out.println("접속실패");
				return;
			}
			
			BufferedInputStream in = new BufferedInputStream(con.getInputStream()); 
			
			byte[] b = in.readAllBytes();
			
			System.out.println(b.length);
			in.close();
			
			File file = new File("\\devel\\storage", "gd_academy.png");
			
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
			
			out.write(b);
			out.close();
			
			con.disconnect();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
