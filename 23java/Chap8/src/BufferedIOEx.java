//���� 8-7. test2.txt �� �̸� ����� �ξ�� �� 
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
				// ���� �����͸� ��� ��ũ���� ���
				out.write(c);
			} // ���۵� �ƿ�ǲ ��Ʈ���� ���۰� ������ �ڵ����� ����� (?)
			//���� �����Ͱ� ��� ��µ� ����
			new Scanner(System.in).nextLine(); // ����Ű �Է�
			out.flush(); // �� �ڿ� �÷��� ������ �� ����� 
			fin.close();
			out.close();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
