#include<iostream>

inline int SQURE(int x)
{
    return x*x;
}

int main(void)
{
    std::cout<<SQURE(5)<<std::endl;
    std::cout<<SQURE(12)<<std::endl;
    return 0;
}