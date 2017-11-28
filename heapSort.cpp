#include<iostream>
using namespace std;

void __shiftDown(int arr[],int n,int k){
    while(2 * k + 1 < n){//存在左节点
        int j = 2 * k + 1;// 在此轮循环中,data[k]要和data[j]交换位置
        if(j + 1 < n && arr[j + 1] > arr[j])
            j ++;// data[j] 是 data[2*k]和data[2*k+1]中的最大值
        if(arr[k] >= arr[j])//如果父节点大于两个子节点中的最大值就结束循环
            break;
        swap(arr[k],arr[j]);//否则将父节点与两个子节点中的最大值互换
        k = j;
    }
}

void heapSort(int arr[],int n){
    //heapify操作，将数组构建成一个最大堆
    for(int i = n - 1 / 2;i >= 0;i--){//从第一个不是叶子结点的结点开始
        __shiftDown(arr,n,i);
    }
    for(int i = n - 1;i > 0;i--){
        swap(arr[0],arr[i]);//数组中第一个值是最大的，将它与最后一个数互换
        __shiftDown(arr,i,0);
    }
}

int main(){
    int arr[10] = {10,9,8,7,6,5,4,3,2,1};
    int n = 10;
    heapSort(arr,n);
    for(int i = 0;i < n;i++)
        cout<<arr[i]<<" ";
    cout<<endl;
}
