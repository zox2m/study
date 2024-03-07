
public class Point {
	// private 은 자식도 접근 못함. 그래서 set 씀
	private int x, y; //한 점을 구성하는 x,y 자표
	public void set(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.print("("+x+","+y+")");
		System.out.print("\n");
	}
}
