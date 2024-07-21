package java_Natwork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main_HttpURLConnection {

	public static void method1() {
		
//		HttpURLConnection 클래스 : 원격 접속이 가능한 클래스
		
		String spec = "https://www.google.com/";
		
		try {
			
//			URL 객체 선언
			URL url = new URL(spec);
			
//			HttpURLConnection 객체 선언 및 생성
			HttpURLConnection con = (HttpURLConnection)url.openConnection(); // 부모타입으로 자식타입을 사용하기 때문에 강제 형번환 필요
			
//			응답 코드 확인 (정상적 -> 숫자 200, 문제 -> 숫자 404 등)
			System.out.println(HttpURLConnection.HTTP_OK); // 200 정상 접속 되었을 때
			System.out.println(HttpURLConnection.HTTP_NOT_FOUND); // 404 
			System.out.println(HttpURLConnection.HTTP_INTERNAL_ERROR); // 내부 에러
			
//			접속 확인
			int responseCode =con.getResponseCode(); // con이 구글로 잘 접속이 되어있는지
			if(responseCode == HttpURLConnection.HTTP_OK){
				System.out.println("접속성공");
			}
			
//			접속 끊기
			con.disconnect();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void method2() {
//		구글 로고 이미지 읽어오기
		
		String spec = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_light_color_272x92dp.png";
		
		try {
			
//			접속
			URL url = new URL(spec);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			int responseCode = con.getResponseCode();
			
			if(responseCode != HttpURLConnection.HTTP_OK) {
				System.out.println("접속실패");
				return; // 접속 실패하면 더이상 진행되지 않도록 return 작성
			}
			
//			java로 읽어들이는 입력 스트림 생성
			BufferedInputStream in = new BufferedInputStream(con.getInputStream()); // 그냥 인풋스트림은 성능이 떨어져서 버퍼사용
			
//			입력 스트림으로부터 데이터 읽기
			byte[] b = in.readAllBytes(); // 모두 읽어와서 배열에 저장
			
			in.close();
			
//			================ 구굴 로고를 읽어서 byte[] 배열에 저장해 둔 상태
			
//			파일 출력 스트림 생성 (파일로 내보내기 위한)
			File dir = new File("\\devel\\storage");
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			File file = new File(dir, "google_logo.png");
			
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
			
//			파일 출력 스트림으로 데이터 내보내기
			out.write(b);
			out.close();
			
//			접속 해제
			con.disconnect();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
//		method1();
		method2();
		
	}

}
