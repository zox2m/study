class A{
	public A() {
		System.out.println("생성자A");
	}
	public A(int x) {
		System.out.println("매개변수 생성자 A");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		System.out.println("매개변수 생성자 B");
	}
}


public class ConstructorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b;
		b = new B(5);
	}

}
