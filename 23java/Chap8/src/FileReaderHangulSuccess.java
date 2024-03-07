// 예제 8-2
import java.io.*;
public class FileReaderHangulSuccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Temp\\hangul.txt"); // 얜 파일 읽는 애
			in = new InputStreamReader(fin,"UTF-8"); // 얘는 
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
