#include<stdio.h>
#include<stdlib.h>

struct PRAC_Dubley_Linked_List
{
    int info;
    struct PRAC_Dubley_Linked_List *left , *right;
};
typedef struct PRAC_Dubley_Linked_List node;
node *create(node *start)
{
    node *temp,*prev;
    int x,ch; 
    do
    {
        printf("\n Enter the value of node ");
        scanf("%d",&x);
        start=NULL;
        temp=(node*)malloc(sizeof(node));
        temp->info=x;
        temp->right=NULL;
        temp->left=NULL;
        if(start == NULL)
        {
            start=temp;
            temp->left=NULL;
        }
        else{
            prev->right=temp;
            temp->left=prev;
        }
        prev=temp;
    } while (ch !=0);
    return start;
    
}
