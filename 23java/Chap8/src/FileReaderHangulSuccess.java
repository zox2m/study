// ���� 8-2
import java.io.*;
public class FileReaderHangulSuccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Temp\\hangul.txt"); // �� ���� �д� ��
			in = new InputStreamReader(fin,"UTF-8"); // ��� 
			int c;
			
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
