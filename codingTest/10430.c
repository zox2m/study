#include<stdio.h>
int main(){
    int A,B,C;
    printf("�� ���ڸ� �Է��ϼ���: "); // �� �̰� ���� �־���� ���� Ʋ�ȴ��� ���� ã�ҳ� ��������
    scanf("%d %d %d",&A,&B,&C);     // �뷮���ѵ� ������ Ȯ���� ��!

    printf("%d\n",(A+B)%C);
    printf("%d\n",((A%C) + (B%C))%C);
    printf("%d\n",(A*B)%C);
    printf("%d\n",((A%C) * (B%C))%C);

    return 0;
}