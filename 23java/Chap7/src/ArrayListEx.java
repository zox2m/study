// 7-3
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		// Ű����κ��� 4���� �̸��� �Է¹޾� ��̸���Ʈ�� ����
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("�̸��� �Է��ϼ��� >>");
			String s = scanner.next(); // Ű����� �Է¹���
			a.add(s); // ��̸���Ʈ �÷��ǿ� ���� . ������ �׹��� 
		}
		
		//��̸���Ʈ�� �̸� ���
		for(int i=0; i<a.size();i++) {
			//arraylist�� i��° ���ڿ� ������
			String name = a.get(i);
			System.out.print(name+" ");
		}
		
		//���� �� �̸� ���
		int longestIndex =0;
		for(int i=0;i<a.size();i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex=i;	
		}
		System.out.println("\n���� �� �̸���:"+a.get(longestIndex));
		
		scanner.close();
	}
	

}
