// 7-5
import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ܾ�� �ѱ� �ܾ��� ���� �����ϴ� hashmap �÷��� ����
		HashMap<String,String> dic = new HashMap<String,String>();
		
		//3���� Ű ��� ���� ����
		dic.put("CG", "�ı�");
		dic.put("OS","��ü");
		dic.put("NW","��Ʈ��ũ");
		
		//���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��?:");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.print("�����մϴ�");
				break;
			}
			//�ؽ� �ʿ��� Ű�� eng�� kor �˻�
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"�� ���� �ܾ� �Դϴ�");
			else System.out.println(kor);
		}
		
		scanner.close();
	}
	

}
