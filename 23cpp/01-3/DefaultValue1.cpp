#include<iostream>

int Adder(int num1=1,int num2=2)
{
    return num1+num2;
}

int main(void){
    std::cout<<Adder()<<std::endl;
    std::cout<<Adder(3)<<std::endl; //첫번째 매개변수, num1에 할당됨. 즉 3 + 2 = 5가 출력
    std::cout<<Adder(3,5)<<std::endl;
    return 0;
}