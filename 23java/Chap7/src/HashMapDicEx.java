// 7-5
import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영어단어와 한글 단어의 쌍을 저장하는 hashmap 컬렉션 생성
		HashMap<String,String> dic = new HashMap<String,String>();
		
		//3개의 키 밸류 쌍을 저장
		dic.put("CG", "컴그");
		dic.put("OS","운체");
		dic.put("NW","네트워크");
		
		//영어 단어를 입력받고 한글 단어 검색
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?:");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.print("종료합니다");
				break;
			}
			//해시 맵에서 키의 eng값 kor 검색
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"는 없는 단어 입니다");
			else System.out.println(kor);
		}
		
		scanner.close();
	}
	

}
