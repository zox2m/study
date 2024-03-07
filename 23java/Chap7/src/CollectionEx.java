//7-8
import java.util.*;

public class CollectionEx {
	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("바바둑");
		myList.add("파라노말 액티비티");
		myList.add("콰이어트 플레이스");
		myList.add(0,"글래스");
		myList.add(2,"추격자");
		
		Collections.sort(myList); // 요소 정렬
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList,"글래스")+1;
		System.out.println("글래스는"+index+"번째 요소입니다.");
		
	}

}
