#include<stdio.h>
// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
int main(){
    int A,B,C = 0;
    printf("세 숫자를 입력하세요: ");
    scanf("%d %d %d",&A,&B,&C); // scan할땐 &넣기!! 간단한거 실수말기

    printf("%f\n",(A+B)%C);
    printf("%f\n",((A%C) + (B%C))%C);
    printf("%f\n",(A*B)%C);
    printf("%f\n",((A%C) * (B%C))%C);
    return 0;
}

