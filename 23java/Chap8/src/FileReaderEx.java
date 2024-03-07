// 예제 8-1
import java.io.*;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fin = null; // 파일 리더는 어떤 파일을 읽을건지 알려주는 객체 
		try { // 왜 try catch 할까? 해당 파일 없으면 프로그램이 그대로 죽는데, 그냥 안죽고 오류를 알려주게 하기 위함임
			// 교재 451p 에 나옴 
			fin = new FileReader("c://windows//system.ini");
			int c; // 왜 글자를 읽는데 int에 넣고, 형변환을 할까? 453쪽 참고 !! 중요함 
			while((c=fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기
				System.out.print((char)c);
			}
			fin.close();
		}
		catch ( IOException e) {
			System.out.println("입출력오류");
			// try 내용물 실행중 예외가 발생하면 , 여기로 이어짐 
		}

	}
}
