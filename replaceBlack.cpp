#include <iostream>
using namespace std;

void replaceBlack(char str[],int length){//length 为字符数组str的总容量，大于或等于字符串str的实际长度

    if(length <= 0)
        return;

    int originalLen = 0;//字符串str的实际长度
    int blackNum = 0;//空格的数量
    int i = 0;

    while(str[i] != '\0'){
            originalLen ++;
        if(str[i] == ' ')
            blackNum ++;

        i ++;
    }

    int newLen = originalLen + 2 * blackNum;//当把空格替换成'%20'之后的长度
    int indexOfOriginal = originalLen;
    int indexOfNew = newLen;

    while(indexOfOriginal >= 0 && indexOfNew > indexOfOriginal){

        if(str[indexOfOriginal] == ' '){
            str[indexOfNew --] = '0';
            str[indexOfNew --] = '2';
            str[indexOfNew --] = '%';
        }
        else{
            str[indexOfNew] = str[indexOfOriginal];
            indexOfNew --;
        }

            indexOfOriginal --;
    }

}

int main(){
    const int length = 100;
    char str[length] = " hello   world  ";
    replaceBlack(str,length);
    cout<<str<<endl;
}
