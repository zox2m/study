// 6-9
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st= new StringTokenizer("���ֹ�/�ڿ���/������","/"); 
		// ù��° �Ű������� ���ڿ�, �ι�°�� ������ 
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
