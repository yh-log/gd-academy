package java_IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class File_MainClass {

	public static void main(String[] args) {

//		경로 구분자
//		1. Windows : \
//		2. Unix, Mac : /
		
//		디렉터리(폴더) 조작 (생성, 삭제)
		
		File dir = new File("\\devel\\storage");
		if(!dir.exists()) { // 없으면 false가 나와서 앞에 !(not)를 붙여서 없으면 true로 바꿔줌
		dir.mkdirs(); // 생성
		}
		
//		dir.deleteOnExit(); // JVM이 종료되면 삭제한다.
		dir.delete();
		
//		File 객체로 지정한 대상의 정보 확인
		File javaHome = new File("\\devel\\jdk-17");
		File[] files = javaHome.listFiles(); 
		
		for(File file : files) {
			System.out.println(file.getName()); // 이름 확인
			System.out.println(file.isDirectory() ? "디렉터리" : "파일"); // 종류 확인 (파일인지 디렉토리인지)
			System.out.println(file.isFile() ? file.length() : 0); // 파일이면 크기를 보여주고 파일이 아니면 0을 보여줘라
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified())); // 최종수정일 (타임스탬프값으로 나옴)
			
		}
		
		
		
		
		
		
		
		
	}

}
