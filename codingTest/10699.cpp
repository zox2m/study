#include <ctime>
#include <iostream>

using namespace std;

int main(){
    // 유닉스 운영체제 시작 이후 시간이 초단위로 나타남 ㄷㄷ 
    time_t timer = time(NULL); 

    //tm 구조체로 변환한다 
    struct tm* t = localtime(&timer);

    cout<< t->tm_year+1900 <<'-';
    cout.width(2); // 폭을 5로 지정
    cout.fill('0'); // 채움 문자는 '*'
    cout << t->tm_mon+1 ;
    cout << '-' <<t->tm_mday;
    

    return 0;
}