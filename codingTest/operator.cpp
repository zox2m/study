#include <iostream>

int main() {
    // 변수 선언과 초기화
    int a = 42;

    // 변수 출력
    std::cout << "The value of a is: " << ++a << std::endl;
    std::cout << "The value of a is: " << a++ << std::endl; // 후위연산 시 , a 값 그대로 출력되고 그 뒤에 증가함 

    return 0;
}
