// 6-9
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st= new StringTokenizer("서주민/박영진/신유진","/"); 
		// 첫번째 매개변수가 문자열, 두번째가 구분자 
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
