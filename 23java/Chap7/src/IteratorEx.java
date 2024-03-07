// 7-4
import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		//이터레이터로 모든 정수 출력하기 
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n= it.next();
			System.out.println(n);
		}
		
		//이터레이터로 모든 정수 더하기
		int sum=0;
		it = v.iterator(); // 이터레이터 객체 얻음
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합: "+sum);
	}

}
