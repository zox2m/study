// �ڷḦ ��üȭ�ؼ� �ٷ�� �� ���� ����.
// �⺻ Ÿ�� ���� ��ü�� �ٷ� �� �ְ� ����� �� Ŭ���� 8���� ���� Ŭ������� �θ�

// �ڷ������� Ŭ������ ����. ���ڿ��� ���ڷ� �ٲ��ְ�~ �׷��͵�. 
// �⺻ Ÿ�� �˾Ƴ���, ���ڿ��� �⺻ Ÿ������ ��ȯ�ϱ�, �⺻Ÿ���� ���ڿ��� ��ȯ�ϱ� ��

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));// A�� �ҹ��ڷ� ��ȯ
		
		char c1='4',c2='F';
		if(Character.isDigit(c1))// ���� c1�� ���ڸ� true
			System.out.println(c1+"�� ����");
		if(Character.isAlphabetic(c2)) // ���� c2�� �����ڸ� true
			System.out.println(c2+"�� ������");
		
		
		System.out.println(Integer.parseInt("-123")); // -123�� 10������ ��ȯ
		
		System.out.println(Integer.toHexString(28)); // 16������
		System.out.println(Integer.toBinaryString(28)); // 2������
		System.out.println(Integer.bitCount(28)); // 2���� ��ȯ�� 1 ���� ��
		
		Double d = Double.valueOf(3.13);
		System.out.println(d.toString()); // Double�� ���ڿ��� ��ȯ
		System.out.println(Double.parseDouble("3.14")); //���ڿ��� �Ǽ��� ��ȯ
		
		boolean b = (4>3); // b�� true
		System.out.println(Boolean.toString(b)); // true�� ���ڿ��� ��ȯ
		System.out.println(Boolean.parseBoolean("false")); //���ڿ��� false�� ��ȯ 
		
	}

}
