package java_Natwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_MainClass {

	public static void main(String[] args) {

//		InetAddress 클래스 : IP 주소를 추상화한 클래스
		
//		도메인을 이용한 InetAddress 객체 생성
		try {
			
			InetAddress iAddr = InetAddress.getByName("www.google.com");
			System.out.println(iAddr.getHostAddress()); // IP 주소
			System.out.println(iAddr.getHostName()); // 도메인
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
//		IP 주소를 이용한 InerAddress 객체 생성
		try {
			
//			IP주소를 바이트 배열로 변환
			byte[] ip = {(byte)172, (byte)217, 24, 100}; // 172, 217은 byte 범위(~127)를 벗어남
			
			InetAddress iAddr = InetAddress.getByAddress(ip);
			System.out.println(iAddr.getHostAddress());
			System.out.println(iAddr.getHostName());
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
