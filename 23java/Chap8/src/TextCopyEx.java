// ���� 8-9 . �Ѿ~ 
import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\windows\\system.ini"); // ���� ���� ��θ� 
		File dest = new File("c:\\Temp\\system.txt"); // ���� ���� ��θ� 
		int c; 
		try { 
			FileReader fr = new FileReader(src); 
			FileWriter fw = new FileWriter(dest); 
			while((c = fr.read()) != -1) { // ���� �ϳ� �а� 
				fw.write((char)c); // ���� �ϳ� ����
			} 
			fr.close(); 
			fw.close(); 
			System.out.println(src.getPath()+ "�� " + dest.getPath()+ "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
			}
		}

}
