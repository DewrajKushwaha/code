#include<stdio.h>
#include<stdlib.h>

struct doubly{
    int info;
    struct doubly *left,*right;
};
typedef struct doubly node;

node *create(node *start){
    node *temp,*prev;

    int x,ch;
    do{
        printf("\n Enter the value of node ");
        scanf("%d",&x);
        temp=(node *)malloc(sizeof(node));
        temp ->info=x;
        temp ->left=NULL;
        temp ->right=NULL;
        if(start == NULL)
        {
            start=temp;
        }
        else{
            prev ->right=temp;
            temp ->left=prev;
        }
        prev=temp;
        printf("\n Want to add more node(y-1/n-0)");
        scanf("%d",&ch);

    }
    while (ch !=0);
    return start;
}
void display(node *start)
{
    node* temp;
    temp=start;
    do{
        printf("---->%d",temp->info);
        temp=temp->right;
    }while (temp != start);
}
int main()
{
    node *start=NULL;
    start=create(start);
    printf("The Doubly Linked List is : ");
    display(start);
    return 0;
}