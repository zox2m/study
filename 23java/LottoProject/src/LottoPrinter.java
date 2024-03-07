import java.util.Arrays;
import java.io.*;

public class LottoPrinter {
	public void LPrinter(int LNum[], int m) {
		int i=0;
		FileWriter fw = null;
		File f = new File("c:\\Temp\\Lotto.txt");
				
		try {
		fw = new FileWriter(f); 
		fw.write("이번 로또 번호는 다음과 같습니다.");
		fw.write("\n");
		for(i=0; i<m; i++) {
			String num =Integer.toString(LNum[i]);
			fw.write(num+" ");
		}
		fw.close();				
	}
	catch(IOException e){
		System.out.println("파일 저장 오류");
	}		
  }
}
