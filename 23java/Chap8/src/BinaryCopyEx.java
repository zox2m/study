//예제 8-10. 8-9보다 나음!
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:\\Temp\\img1.jpg"); // 원본파일
		File dest = new File("c:\\Temp\\copyimg.jpg"); //복사 파일 
		
		int c;
		try { 
			FileInputStream fi = new FileInputStream(src);// 파일 입력 바이트 스트림 생성
			FileOutputStream fo = new FileOutputStream(dest); //파일 출력 바이트 스트림 생성
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close(); 
			fo.close(); 
			System.out.println( src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) { 
			System.out.println("파일 복사 오류"); }
	}

}
