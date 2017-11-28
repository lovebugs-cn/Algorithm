#include <iostream>
using namespace std;

int __binarySearch(int arr[],int l,int r,int target){
    if(l > r)
        return -1;
    int mid = l + (r - l) / 2;
    if(arr[mid] == target)
        return mid;
    else if(arr[mid] > target)
        return __binarySearch(arr,l,mid-1,target);
    else
        return __binarySearch(arr,mid+1,r,target);
}

int binarySearch(int arr[],int n,int target){
    __binarySearch(arr,0,n-1,target);
}

int main(){
    int arr[10] = {1,2,3,4,5,6,7,8,9,10};
    int n = 10;
    int res = binarySearch(arr,n,10);
    cout<<res<<endl;
}
