// 7-1
// 벡터는 멀티 스레드에 최적화 되어있고
// 어레이 리스트는 단일 스레드 즉, 하나의 프로세스에서 사용이 더 쉽다 
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(); // () 잊지 않기! 
		
		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1);// -1 삽입
		
		//벡터 중간에 삽입
		v.add(2,100); // 인덱스 2번에 100 삽입)
		
		System.out.println("벡터 내의 요소 객체 수:"+v.size());
		System.out.println("벡터의 현재 용량:"+ v.capacity());
		
		//모든 요소 정수 출력하기
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		//벡터 속의 모든 정수 더하기
		int sum =0;
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합:"+ sum);
	}

}
