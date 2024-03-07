//함수의 오버로딩
/*
함수의 호출방식 3가지
1. 값에 의한 호출 call  by value
2. 주소에 의한 호출 call by address ( pointer)
3. 참조에 의한 호출 call by reference

이 예제는 swap(&ch1,&ch2) 이렇게 주소를 넘기므로 2번을 썼다
주소로 받았으니 매개변수로 int *a 이렇게 썼다. 
내가 실수한 점- temp에 주소를 받았으니, temp값은 그대로 넘겨야 하는데 
*temp넘기고 난리 ㅋㅋㅋㅋㅋ
*/

#include <iostream>

int temp;
void swap(int *a,int *b){
    std::cout<<"int* called"<<std::endl;
    temp = *a;
    *a = *b;
    *b = temp;    
}

void swap(char *a,char *b){
    std::cout<<"char* called"<<std::endl;
    temp = *a;
    *a = *b;
    *b = temp;    
}

void swap(double *a,double *b){
    std::cout<<"double* called"<<std::endl;
    temp = *a;
    *a = *b;
    *b = temp;    
}

int main(void)
{
    int num1=20, num2=30;
    swap(&num1,&num2);
    std::cout<<num1<<' '<<num2<<std::endl;

    char ch1='A',ch2='Z';
    swap(&ch1,&ch2);
    std::cout<<ch1<<' '<<ch2<<std::endl;

    double db1=1.111, db2=5.555;
    swap(&db1,&db2);
    std::cout<<db1<<' '<<db2<<std::endl;

    return 0;
}