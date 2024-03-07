// 7-3
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 4개의 이름을 입력받아 어레이리스트에 삽입
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요 >>");
			String s = scanner.next(); // 키보드로 입력받음
			a.add(s); // 어레이리스트 컬렉션에 삽입 . 이짓을 네번함 
		}
		
		//어레이리스트의 이름 출력
		for(int i=0; i<a.size();i++) {
			//arraylist의 i번째 문자열 얻어오기
			String name = a.get(i);
			System.out.print(name+" ");
		}
		
		//가장 긴 이름 출력
		int longestIndex =0;
		for(int i=0;i<a.size();i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex=i;	
		}
		System.out.println("\n가장 긴 이름은:"+a.get(longestIndex));
		
		scanner.close();
	}
	

}
