// ���� 6-7 
public class stringEx {

	public static void main(String[] args) {
		
//		String a = "Hello";
//		String b = "Java";
//		String c = "Hello"; //���ͷ��̶�� �ؼ�, �̷� ��쿣 a�� ���� ��ü�� �����ϴµ�?
//		
//		a = a.concat(b); // concat�� �� ��ü�� ������ ���� ���ο� ��ü�� ������
//		
//		System.out.println(a); // �� ����
//		System.out.println(c); // �ٸ���! 
		
		
		//���� 6-7
		String a= new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a+"�� ���̴�"+a.length());
		System.out.println(a.contains("#")); // ���ڿ��� ���԰���
		
		a = a.concat(b);
		System.out.println(a);
		
		a=a.trim();
		System.out.println(a);
		
		a=a.replace("C#", "Java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for(int i=0;i<s.length;i++) 
			System.out.println("�и��� ���ڿ�"+i+":"+s[i]);
		
		
		a = a.substring(5);// �ε��� 5���� ������ ���꽺Ʈ�� ����
		System.out.println(a);
		
		char c = a.charAt(2); // �ε��� 2�� ���� ���� 
		System.out.println(c);
		
		// ��Ʈ���� ������ �ʴ´ٰ� �ߴµ�, �� �����Ǵ°� ó�� ������?!
		// �̴� ��Ʈ�� ���۸� �˸鼭 ���� �����غ���. (��������!)
		
	}
}
