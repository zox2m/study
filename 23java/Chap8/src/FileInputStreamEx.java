// 8-6 ���� �������� ���ؼ� ������ �� 
import java.io.*;
public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[6];
		try {
			//"c://Temp//test.out" ���� �о �迭 b �� ����
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n=0,c;
			while((c = fin.read())!= -1) {
				//-1�� EOF �� �ǹ���. 
				b[n] = (byte)c; //���� ����Ʈ�� �迭�� ����
				n++; 
			}
			//�迭 b[] �� ����Ʈ ���� ��� ȭ�鿡 ���
		} catch(IOException e) {
			
		}
	}

}
