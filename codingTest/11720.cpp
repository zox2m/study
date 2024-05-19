#include <iostream>
#include <string>

using namespace std;

int main(){
    int n,sum = 0; // 몇개인지, 합 
    string s;

    cin >> n;
    cin >> s; 
    
    for(int i= 0; i < n; i++ ){ 
        sum += s[i] - '0'; // 10의 i제곱 으로 line을 나눔 
    }

    cout << sum <<endl;

    return 0;
}