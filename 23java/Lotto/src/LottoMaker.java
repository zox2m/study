public class LottoMaker{	
	
	
	public static void main(String[] args) {
		LottoPrinter lp = new LottoPrinter();//LottoPrinter�� ȣ���� ��ü ����

		int result[];// �ζ� ��ȣ�� ���� �迭 result�� ����
				
		LottoM LM = new LottoM(10, 8);//������ LottoM�� ȣ���Ͽ� n�� ũ�� ����
		result=LM.LottoGen();//LotGen���� ������ ��ȣ�� result�� ����
		lp.LPrinter(result, 8);//�ζ� ��ȣ�� LottoPrinter�� ȣ��
	}

}
