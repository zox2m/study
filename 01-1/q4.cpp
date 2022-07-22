//아니 결과가 1만원씩 적게 나온다..이게 뭐지
//노동부에 신고해 ㅠㅠ

#include<iostream>

int main(void)
{
    int sell,wage;
    int bonus[5];
    double db;
    double result;

    while(true)
    {
        wage=50;
        std::cout<<"sell amount(-1 to end): ";
        std::cin>>sell;
        if(sell==-1) break;

        // //체크용
        // std::cout<<"wage:"<<wage<<std::endl;
        // std::cout<<"sell: "<<sell<<std::endl;
        // std::cout<<"bonus: "<<bonus<<std::endl;

        bonus[0] = sell*0.12;
        bonus[1] = sell*12/100;
        bonus[2] = sell*12*0.01;
        bonus[3] = sell*0.01*12;
        bonus[4] = sell*0.24;
        db = sell*0.12;

        // //각 경우의 임금
        // std::cout<<"wage for this month: "<< wage + bonus[0]<<'\n'<<std::endl;
        // std::cout<<"wage for this month: "<< wage + bonus[1]<<'\n'<<std::endl;
        // std::cout<<"wage for this month: "<< wage + bonus[2]<<'\n'<<std::endl;
        // std::cout<<"wage for this month: "<< wage + bonus[3]<<'\n'<<std::endl;
        // std::cout<<"wage for this month: "<< wage + bonus[4]<<'\n'<<std::endl;

        std::cout<<"sell*0.12    : "<< bonus[0]<<std::endl;
        std::cout<<"sell*12/100  : "<< bonus[1]<<std::endl;
        std::cout<<"sell*12*0.01 : "<< bonus[2]<<std::endl;
        std::cout<<"sell*0.01*12 : "<< bonus[3]<<std::endl;
        std::cout<<"sell*0.24    : "<< bonus[4]<<std::endl;
        std::cout<<"as double    : "<< db<<'\n'<<std::endl;
        for(int i=0;i<10000; i++)
        {
            result +=db;
        }
        std::cout<<"db 10000: "<< result<<'\n'<<std::endl;
        // //체크용
        // std::cout<<"wage:"<<wage<<std::endl;
        // std::cout<<"sell: "<<sell<<std::endl;
        // std::cout<<"sell*0.12: "<<sell*0.12<<std::endl;
        // std::cout<<"bonus: "<<bonus<<std::endl;
    }
    
    return 0;
}