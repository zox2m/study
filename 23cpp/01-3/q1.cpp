/*디폴트3 예제를 매개변수의 디폴트값 저장이 아닌 함수의 오버로딩 형태로 재구현해보라*/

#include<iostream>
int BoxVolume(int length,int width,int height);
int BoxVolume(int length,int width);
int BoxVolume(int length);

int main(void){
    std::cout<<"[3,3,3]: "<<BoxVolume(3,3,3)<<std::endl;
    std::cout<<"[5,5,D]: "<<BoxVolume(5,5)<<std::endl;
    std::cout<<"[7,D,D]: "<<BoxVolume(7)<<std::endl;
    //std::cout<<"[D,D,D]: "<<BoxVolume()<<std::endl; //첫번째 매개변수는 디폴트가 없기때문에 컴파일에러
}

int BoxVolume(int length,int width,int height){
    return length*width*height;
}
int BoxVolume(int length,int width){
    int height = 1;
    return length*width*height;
}
int BoxVolume(int length){
    int width=1,height =1;
    return length*width*height;
}