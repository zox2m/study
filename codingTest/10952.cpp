#include <iostream>
#include <vector>
using namespace std;

int main(){
    int a,b;
    vector<int> a_list;
    vector<int> b_list;

    while(true){
        //첫 줄에 a와 b 
        cin >> a >> b;
        if(a==0 && b==0) break;
        
        a_list.push_back(a);
        b_list.push_back(b);
    }

    for(int i=0;i < a_list.size();i++){
        cout << a_list[i]+b_list[i]<<endl;
    }

    return 0;
}