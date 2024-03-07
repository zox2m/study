#include<stdio.h>
int main()
{
    long long a,b,c;            // long long 을 쓰는게 포인트 범위가 10^12 기 때문!! int 는 2^31승으로 약 20억까지 가능함 
    scanf("%lld %lld %lld",&a,&b,&c);
    printf("%lld\n",a+b+c);
    return 0;
}