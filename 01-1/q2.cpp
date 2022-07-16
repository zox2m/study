#include<iostream>
int main(void)
{
    char name[100];
    char number[200];

    std::cout<<"what's your nam?";
    std::cin>>name;

    std::cout<<"what's your numner?"; //문자열이라, 띄쓰하면 잘린다! 
    std::cin>>number;

    std::cout<<"your name is "<<name<<'\n';
    std::cout<<"your number is "<<number<<std::endl;
    return 0;
}