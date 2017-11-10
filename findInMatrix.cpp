#include<iostream>
using namespace std;

bool findInMatrix(int* matrix,int rows,int columns,int target){
    bool found = false;
    if(rows > 0 && columns > 0){
        int row = 0;
        int column = columns - 1;
        while(row < rows && column >= 0){
            //当前行号*总共的列数+当前列号
            if(matrix[row * columns + column] == target){
                found = true;
                break;
            }

            else if(matrix[row * columns + column] > target){
                column --;
            }else{
                row ++;
            }
        }

    }
    return found;
}

int main(){
    int matrix[4][4] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    int rows = 4;
    int columns = 4;
    bool result = findInMatrix((int*)matrix,rows,columns,4);
    cout<<result;
}
