
public class Student extends Person {
	public void set() {
		age=23;
		name="서주민";
		height=157;
		//weight=99; //private 이라 안됨
		setWeight(52); // set으로 접근 
	}
}
