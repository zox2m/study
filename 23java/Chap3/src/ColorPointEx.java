
public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point(); // Point ��ü ����
		p.set(1, 2); // Point Ŭ������ set() ȣ�� 
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint(); // �÷��� ��ǥ ���

	}

}
