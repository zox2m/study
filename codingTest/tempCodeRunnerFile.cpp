#include <iostream>

using namespace std;

int main(){
    int n,m,result;
    cin >>n>>m;
    result = n-m;
    if((result)<0) result*=-1;

    cout<<result;
    return 0;
}