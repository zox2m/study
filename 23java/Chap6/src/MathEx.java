// 6-10
public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);// ������
		System.out.println(Math.ceil(3.14)); // �ø�
		System.out.println(Math.floor(3.14)); //����
		System.out.println(Math.sqrt(9));// ������
		System.out.println(Math.exp(2)); // ����
		System.out.println(Math.round(3.14));//�ݿø�
		
		// [1,45] ���� ������ ���� 5�� �߻�
		System.out.print("�̹��� ����� ��ȣ�� ");
		for(int i=0;i<5;i++)
			System.out.print((int)(Math.random()*45+1)+" ");
	}

}

// random() �Լ��� 0.0�̻� 1.0�̸��� ������ double�� ��ȯ�Ѵ�
// ���⿡ * 100 �� �ϸ� ������ 100 ���� �Ǽ��� ��
// �� �տ� (int) �� �ٿ��ָ� ����ȯ�Ǿ�, �Ҽ��� ���ϰ� ���ŵ� ������ ���� .
