// 7-1
// ���ʹ� ��Ƽ �����忡 ����ȭ �Ǿ��ְ�
// ��� ����Ʈ�� ���� ������ ��, �ϳ��� ���μ������� ����� �� ���� 
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(); // () ���� �ʱ�! 
		
		v.add(5); // 5 ����
		v.add(4); // 4 ����
		v.add(-1);// -1 ����
		
		//���� �߰��� ����
		v.add(2,100); // �ε��� 2���� 100 ����)
		
		System.out.println("���� ���� ��� ��ü ��:"+v.size());
		System.out.println("������ ���� �뷮:"+ v.capacity());
		
		//��� ��� ���� ����ϱ�
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		//���� ���� ��� ���� ���ϱ�
		int sum =0;
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� ��:"+ sum);
	}

}
