#include <iostream>
using namespace std;

/*

题目：
有两个排序的数组A1和A2，内存在A1的末尾有足够多的空余空间容纳A2。
请实现一个函数，把A2中的所有数字插入到A1中并且所有数字是排序的。

分析：
这道题就是实现一个归并排序，只是在数组中，数据是顺序存储的，
如果在数组头部进行归并排序，每一次操作都会移动后面所有的数据，开销很大。所以应该从尾部进行操作。

实现：
两个数组的初始实际长度是固定，而数组arr2也不需要进行改动，所以都可以声明为常量，进行保护。
题目中已经说明空间足够，不然还需要再声明一个参数length，表示arr1的维度，与arr1，arr2的初始长度之和进行比较，以防越界。
i，j为arr1，arr2数组实际末尾下标，k为a1数组中进行归并位置的下标
如果arr1数组中未处理末尾的数大于或等于arr2数组中未处理末尾的数，则将arr1的该位置的数插入到arr1数组末尾，否则插入arr2该位置的数
如果数组arr2中还有元素没有插入到数组a1中，则全部依次插入到数组a1前面位置

*/
void insertArray(int* arr1,const int len1,const int* arr2,const int len2){

    int i = len1 - 1;
    int j = len2 - 1;
    int k = len1 + len2 - 1;

    while(i >=0 && j >= 0){
        if(arr1[i] >= arr2[j]){
            arr1[k--] = arr1[i--];
        }else{
            arr1[k--] = arr2[j--];
        }
    }

    while(j >= 0){
        arr1[k--] = arr2[j--];
    }
}

int main(){
    int a1[30] = {1,2,4,5,6,12,20,23,25,30};
    int a2[8] = {3,5,6,8,9,10,11,22};
    insertArray((int*)a1,10,(int*)a2,8);
    for(int i = 0; i < 18; i ++){
        cout<<a1[i]<<" ";
    }
}
