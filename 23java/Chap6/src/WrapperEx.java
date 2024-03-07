// 자료를 객체화해서 다뤄야 할 때가 있음.
// 기본 타입 값을 객체로 다룰 수 있게 만들어 둔 클래스 8개를 래퍼 클래스라고 부름

// 자료형마다 클래스가 있음. 문자열을 숫자로 바꿔주고~ 그런것들. 
// 기본 타입 알아내기, 문자열을 기본 타입으로 변환하기, 기본타입을 문자열로 변환하기 등

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));// A를 소문자로 변환
		
		char c1='4',c2='F';
		if(Character.isDigit(c1))// 문자 c1이 숫자면 true
			System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2)) // 문자 c2가 영문자면 true
			System.out.println(c2+"는 영문자");
		
		
		System.out.println(Integer.parseInt("-123")); // -123을 10진수로 변환
		
		System.out.println(Integer.toHexString(28)); // 16진수로
		System.out.println(Integer.toBinaryString(28)); // 2진수로
		System.out.println(Integer.bitCount(28)); // 2진수 변환후 1 갯수 셈
		
		Double d = Double.valueOf(3.13);
		System.out.println(d.toString()); // Double을 문자열로 변환
		System.out.println(Double.parseDouble("3.14")); //문자열을 실수로 변환
		
		boolean b = (4>3); // b는 true
		System.out.println(Boolean.toString(b)); // true를 문자열로 변환
		System.out.println(Boolean.parseBoolean("false")); //문자열을 false로 변환 
		
	}

}
