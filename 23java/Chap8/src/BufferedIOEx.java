//예제 8-7. test2.txt 는 미리 만들어 두어야 함 
//import java.io.*;
import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);
			while((c = fin.read()) != -1) {
				// 파일 데이터를 모두 스크린에 출력
				out.write(c);
			} // 버퍼드 아웃풋 스트림은 버퍼가 꽉차면 자동으로 출력함 (?)
			//파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine(); // 엔터키 입력
			out.flush(); // 그 뒤엔 플러시 만나면 또 출력함 
			fin.close();
			out.close();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
