#include <iostream>
#include <sstream>
#include <string>

int main() {
    std::string inputLine;
    std::getline(std::cin, inputLine); // 사용자로부터 한 줄 입력 받기

    std::istringstream iss(inputLine);
    std::string word;
    int wordCount = 0;

    // istringstream 객체를 사용해 입력 받은 문자열을 단어 단위로 분리
    while (iss >> word) {
        wordCount++;
    }

    //std::cout << "단어의 개수: " << wordCount << std::endl;

    if(wordCount%2 !=0) std::cout << "lets go " <<std::endl;

    return 0;
}
