// 6-10
public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);// 원주율
		System.out.println(Math.ceil(3.14)); // 올림
		System.out.println(Math.floor(3.14)); //내림
		System.out.println(Math.sqrt(9));// 제곱근
		System.out.println(Math.exp(2)); // 제곱
		System.out.println(Math.round(3.14));//반올림
		
		// [1,45] 사이 정수형 난수 5개 발생
		System.out.print("이번주 행운의 번호는 ");
		for(int i=0;i<5;i++)
			System.out.print((int)(Math.random()*45+1)+" ");
	}

}

// random() 함수는 0.0이상 1.0미만의 임의의 double을 반환한다
// 여기에 * 100 을 하면 범위가 100 사이 실수가 됨
// 그 앞에 (int) 를 붙여주면 형변환되어, 소수점 이하가 제거된 정수가 나옴 .
