#include <iostream>

using namespace std;

int main(){
    // 첫째 줄에 정수 N이 주어진다
    int n;
    int result=1;
    cin>>n;

    // n!을 출력한다
    for(int i=1;i<n+1;i++){
        result*=i;
    }

    cout<<result<<endl;

    return 0;
}