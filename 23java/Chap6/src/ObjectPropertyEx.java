
public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); //Ŭ���� �̸�
		System.out.println(obj.hashCode()); // �ؽ��ڵ尪
		System.out.println(obj.toString()); // ��ü�� ���ڿ��� ���
		System.out.println(obj); // ��ü ���
	}
	
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
	}
}
