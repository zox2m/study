//���� 8-10. 8-9���� ����!
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:\\Temp\\img1.jpg"); // ��������
		File dest = new File("c:\\Temp\\copyimg.jpg"); //���� ���� 
		
		int c;
		try { 
			FileInputStream fi = new FileInputStream(src);// ���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo = new FileOutputStream(dest); //���� ��� ����Ʈ ��Ʈ�� ����
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close(); 
			fo.close(); 
			System.out.println( src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (IOException e) { 
			System.out.println("���� ���� ����"); }
	}

}
