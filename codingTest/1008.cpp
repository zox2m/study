#include <iostream>

using namespace std;

int main() {    
    long double num1,num2;
    cin >> num1 >>num2;
    cout.precision(9);
    cout << fixed;
    cout << num1 / num2;
    return 0;
}
