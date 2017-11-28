//向链表的末尾添加一个节点
#include<stdio.h>
#include<iostream>
using namespace std;

struct ListNode{
    int p_value;
    ListNode *p_next;
};

void addToTail(ListNode **pHead,int value){

    ListNode *pNew = new ListNode();
    pNew->p_value = value;
    pNew->p_next = NULL;

    if(*pHead == NULL){
        *pHead = pNew;
    }
    else{
        ListNode *pNode = *pHead;
        while(pNode->p_next!=NULL){
           pNode = pNode->p_next;
        }
        pNode->p_next = pNew;
    }
}
