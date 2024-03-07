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
		myList.add("�ٹٵ�");
		myList.add("�Ķ�븻 ��Ƽ��Ƽ");
		myList.add("���̾�Ʈ �÷��̽�");
		myList.add(0,"�۷���");
		myList.add(2,"�߰���");
		
		Collections.sort(myList); // ��� ����
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList,"�۷���")+1;
		System.out.println("�۷�����"+index+"��° ����Դϴ�.");
		
	}

}
