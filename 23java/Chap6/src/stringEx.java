// 예제 6-7 
public class stringEx {

	public static void main(String[] args) {
		
//		String a = "Hello";
//		String b = "Java";
//		String c = "Hello"; //리터럴이라고 해서, 이런 경우엔 a와 같은 객체에 연결하는듯?
//		
//		a = a.concat(b); // concat은 두 객체의 내용을 가진 새로운 객체를 생성함
//		
//		System.out.println(a); // 두 값이
//		System.out.println(c); // 다르다! 
		
		
		//예제 6-7
		String a= new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a+"의 길이는"+a.length());
		System.out.println(a.contains("#")); // 문자열의 포함관계
		
		a = a.concat(b);
		System.out.println(a);
		
		a=a.trim();
		System.out.println(a);
		
		a=a.replace("C#", "Java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for(int i=0;i<s.length;i++) 
			System.out.println("분리된 문자열"+i+":"+s[i]);
		
		
		a = a.substring(5);// 인덱스 5부터 끝까지 서브스트링 리턴
		System.out.println(a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴 
		System.out.println(c);
		
		// 스트링은 변하지 않는다고 했는데, 왜 수정되는것 처럼 보이지?!
		// 이는 스트링 버퍼를 알면서 같이 이해해보자. (다음으로!)
		
	}
}
