#include <iostream>
#include <vector>
using namespace std;

int main(){
    int t;

    cin>>t;

    int * a = new int[t];
    int * b = new int[t];

    for(int i=0;i<t;i++){

        cin>>a[i]>>b[i];
    }

    for(int i=0;i<t;i++){
        cout<< a[i]+b[i]<<endl;
    }
    
    return 0;
}