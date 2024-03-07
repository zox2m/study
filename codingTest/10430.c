#include<stdio.h>
int main(){
    int A,B,C;
    printf("세 숫자를 입력하세요: "); // 와 이거 질문 넣어놓고 뭐가 틀렸는지 한참 찾았네 ㅋㅋㅋㅋ
    scanf("%d %d %d",&A,&B,&C);     // 용량제한도 있으니 확인할 것!

    printf("%d\n",(A+B)%C);
    printf("%d\n",((A%C) + (B%C))%C);
    printf("%d\n",(A*B)%C);
    printf("%d\n",((A%C) * (B%C))%C);

    return 0;
}