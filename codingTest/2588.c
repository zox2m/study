#include<stdio.h>
int main(){
    int a,b;
    scanf("%d",&a);
    scanf("%d",&b);

    int b3 = b/100;
    int b2 = (b%100)/10; 
    int b1 = b%10;
    printf("%d\n",a*b1);
    printf("%d\n",a*b2);
    printf("%d\n",a*b3);
    printf("%d\n",(a*b1)+10*(a*b2)+100*(a*b3));
    
    return 0;
}