import java.util.Arrays;
import java.io.*;

public class LottoPrinter {
	public void LPrinter(int LNum[], int m) {
		int i=0;
		FileWriter fw = null;
		File f = new File("c:\\Temp\\Lotto.txt");
				
		try {
		fw = new FileWriter(f); 
		fw.write("�̹� �ζ� ��ȣ�� ������ �����ϴ�.");
		fw.write("\n");
		for(i=0; i<m; i++) {
			String num =Integer.toString(LNum[i]);
			fw.write(num+" ");
		}
		fw.close();				
	}
	catch(IOException e){
		System.out.println("���� ���� ����");
	}		
  }
}
