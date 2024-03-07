#include<stdio.h>
int main(void){
    //배열 초기화
    int piece[6] = {1,1,2,2,2,8};
    int dong[6];
    int total[6];
    scanf("%d %d %d %d %d %d",&dong[0],&dong[1],&dong[2],&dong[3],&dong[4],&dong[5]);
    
    for(int i=0;i<6;i++){
        total[i] = piece[i]-dong[i];
    }
    printf("%d %d %d %d %d %d",total[0],total[1],total[2],total[3],total[4],total[5]);

    return 0;
}