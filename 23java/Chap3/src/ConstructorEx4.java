class C{
	public C() {
		System.out.println("������A");
	}
	public C(int x) {
		System.out.println("�Ű����� ������ A");
	}
}

class D extends C {
	public D() {
		System.out.println("������ B");
	}
	public D(int x) {
		super(x); // �θ� Ŭ����! �� �Ű����� x �־ ����
		System.out.println("�Ű����� ������ B");
	}
}


public class ConstructorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d;
		d = new D(5);
	}

}
