#include<iostream>
int main(void)
{
    int val,result =0;

    
    for(int i=1;i<6;i++)
    {
        std::cout<<i<<"th int: ";
        std::cin>>val;

        result+= val;
    }
    std::cout<<"total: "<<result<<std::endl;

    return 0;
}