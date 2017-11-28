//在链表中找到第一个含有某值的节点并删除

#include <stdio.h>
#include <iostream>
using namespace std;

struct ListNode{
    int p_value;
    ListNode *p_next;
};

void removeNode(ListNode **pHead,int value){

    if(pHead == NULL || *pHead == NULL)
        return;

    ListNode *pDelete == NULL;

    if((*pHead)->p_value == value){
        pDelete = *pHead;
        *pHead = (*pHead)->p_next;
    }
    else{
        ListNode *pNode = *pHead;
        while(pNode->p_next != NULL && pNode->p_next->p_value != value)
            pNode = pNode->next;

        if(pNode->p_next != NULL && pNode->p_next->p_value == value){
            pDelete = pNode->p_next;
            pNode->p_next = pNode->p_next->p_next;
        }
    }

    if(pDelete != NULL){
        delete pDelete;
        pDetele = NULL;
    }

}
