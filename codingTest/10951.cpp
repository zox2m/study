#include <iostream>
#include <vector>
using namespace std;

int main(){
    char n[20];
    int a,b;
    vector<int> results;

    
    while(cin.getline(n,15)){
        //첫 줄에 a와 b 
        cin>>a>>b;
        results.push_back(a+b);
    }

    //결과 출력
    for(int i=0;i < results.size();i++){
        cout << results[i] <<endl;
    }

    return 0;
}