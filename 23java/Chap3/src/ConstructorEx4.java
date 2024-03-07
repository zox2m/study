class C{
	public C() {
		System.out.println("생성자A");
	}
	public C(int x) {
		System.out.println("매개변수 생성자 A");
	}
}

class D extends C {
	public D() {
		System.out.println("생성자 B");
	}
	public D(int x) {
		super(x); // 부모 클래스! 를 매개변수 x 넣어서 생성
		System.out.println("매개변수 생성자 B");
	}
}


public class ConstructorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d;
		d = new D(5);
	}

}
