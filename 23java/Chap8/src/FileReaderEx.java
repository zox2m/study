// ���� 8-1
import java.io.*;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fin = null; // ���� ������ � ������ �������� �˷��ִ� ��ü 
		try { // �� try catch �ұ�? �ش� ���� ������ ���α׷��� �״�� �״µ�, �׳� ���װ� ������ �˷��ְ� �ϱ� ������
			// ���� 451p �� ���� 
			fin = new FileReader("c://windows//system.ini");
			int c; // �� ���ڸ� �дµ� int�� �ְ�, ����ȯ�� �ұ�? 453�� ���� !! �߿��� 
			while((c=fin.read()) != -1) { // �� ���ھ� ���� ������ �б�
				System.out.print((char)c);
			}
			fin.close();
		}
		catch ( IOException e) {
			System.out.println("����¿���");
			// try ���빰 ������ ���ܰ� �߻��ϸ� , ����� �̾��� 
		}

	}
}
