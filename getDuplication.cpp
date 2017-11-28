#include<iostream>
using namespace std;

int countRange(int arr[],int length,int l,int r){
    int num = 0;
    for(int i = 0; i < length; i++){
        if(arr[i] >= l && arr[i] <= r)
            num ++;
    }
    return num;
}

int getDuplication(int arr[],int length){
    int l = 1;
    int r = length - 1;
    while(l <= r){
        int mid = (r + l) / 2;
        int num = countRange(arr,length,l,mid);

        if(l == r){
            if(num > 1)
                return l;
            else
                break;
        }

        if(num > (mid - l + 1))
            r = mid;
        else
            l = mid + 1;
    }
    return -1;
}



int main(){
    int arr[5] = {1,2,2,3,4};
    cout<<getDuplication(arr,5);
}
