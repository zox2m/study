import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class forMinju {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		//int c;
		try {
			fout = new FileWriter("c:\\Temp\\Minju.txt");
			System.out.print("�̸��� �Է��ϼ���: ");
			String name = scanner.nextLine();
			name = name + " �ٺ� ";
			for(int i=0;i<100;i++) {				
				fout.write(name,0,name.length());
				//fout.write("\r\n",0,2);
			}
			fout.close();
		}catch (IOException e) {
			System.out.println("������ ����");
		}
		scanner.close();
	}

}
