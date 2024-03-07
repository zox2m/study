// 8-6 예제 수업에서 안해서 덜썼음 걍 
import java.io.*;
public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[6];
		try {
			//"c://Temp//test.out" 파일 읽어서 배열 b 에 저장
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n=0,c;
			while((c = fin.read())!= -1) {
				//-1은 EOF 을 의미함. 
				b[n] = (byte)c; //읽은 바이트를 배열에 저장
				n++; 
			}
			//배열 b[] 의 바이트 값을 모두 화면에 출력
		} catch(IOException e) {
			
		}
	}

}
