#include <stdio.h>
#include <iostream>
#include <stack>
using namespace std;

struct ListNode{
    int p_value;
    ListNode * p_next;
};

//µü´ú
void printListReversingly_Iteratively(ListNode *pHead){

    stack<ListNode*>nodes;
    ListNode *pNode = pHead;

    while(pNode != NULL){
        nodes.push(pNode);
        pNode = pNode->p_next;
    }

    while(!nodes.empty()){
        pNode = nodes.top();
        cout<<pNode->p_value;
        nodes.pop();
    }

}

//µÝ¹é
void printListReversingly_Recursively(ListNode *pHead){

    if(pHead != NULL){
        if(pHead->p_next != NULL){
            printListReversingly_Recursively(pHead->p_next);
        }
        cout<<pHead->p_value;
    }
}
