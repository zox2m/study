
public class Point {
	// private �� �ڽĵ� ���� ����. �׷��� set ��
	private int x, y; //�� ���� �����ϴ� x,y ��ǥ
	public void set(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.print("("+x+","+y+")");
		System.out.print("\n");
	}
}
