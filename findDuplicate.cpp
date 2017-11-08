#include<iostream>
using namespace std;
int duplication(int arr[],int length){

    for(int i = 0; i < length; i++){
        if(arr[i] < 0 || arr[i] > length - 1){
            return -1;
        }
    }

    for(int i = 0; i < length; i++){
        while(arr[i] != i){
            if(arr[i] == arr[arr[i]]){
                int dupliaction = arr[i];
                return dupliaction;
            }

            swap(arr[i],arr[arr[i]]);
        }
    }
    return -1;
}

int main(){
    int arr[5] = {4,1,3,2,4};
    cout<<duplication(arr,5);
}
