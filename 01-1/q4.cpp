//아니 결과가 1만원씩 적게 나온다..이게 뭐지
//노동부에 신고해 ㅠㅠ

#include<iostream>

int main(void)
{
    int sell,wage;
    while(true)
    {
        int wage=50;
        std::cout<<"sell amount(-1 to end): ";
        std::cin>>sell;
        if(sell==-1) break;

        std::cout<<"wage:"<<wage<<std::endl;
        std::cout<<"sell * 0.12: "<<sell*0.12<<std::endl;

        wage += sell*0.12;
        std::cout<<"wage for this month: "<< wage<<std::endl;
    }
    
    
    return 0;
}