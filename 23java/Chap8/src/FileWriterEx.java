// ���� 8-4
import java.io.*;
import java.util.*;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		//int c;
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch (IOException e) {
			System.out.println("������ ����");
		}
		scanner.close();
	}

}
