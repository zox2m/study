// 7-4
import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		//���ͷ����ͷ� ��� ���� ����ϱ� 
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n= it.next();
			System.out.println(n);
		}
		
		//���ͷ����ͷ� ��� ���� ���ϱ�
		int sum=0;
		it = v.iterator(); // ���ͷ����� ��ü ����
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� ��: "+sum);
	}

}
