/*다음 형태의 함수 오버로딩은 어떤 문제가 있는가*/
int SimpleFunc(int a=10)
{
    return a+1;
}

int SimpleFunc(void)
{
    return 10;
}
int main(void){
    SimpleFunc();
    return 0;
}
/*Simplefunc() 가 호출되었을 때, 둘다 해당된다. 그럼 뭐가 작동하지?*/ 
/*오버로드된 함수중 두개이상이 인수목록과 일치합니다 라는 경고가 뜸*/