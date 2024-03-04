#include<stdio.h>
#include<stdlib.h>

struct stackll
{
    int info;
    struct stackll *next;
};
 struct stackll *top;
 typedef struct stackll node;

 void push();
 void pop();
 void pip();

void main()
{

    int ch=0;
    do
    {
        printf("\n ######## Stack using Linked List ########");

        printf("\n Press 1. Push");
        printf("\n Press 2. Pop");
        printf("\n Press 3. Display");
        printf("\n Press 4. Exit");
        printf("\n\n Enter your choice \t");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            pip();
            break;
        case 4:
            exit(0);break;
        default :
            printf("\n !!!! Invalid Selection");

        }
    }
    while(ch !=4);
}

void push()
{
    int val;
  node *ptr;
    ptr=( node*)malloc(sizeof( node));
    if(ptr==NULL)
    {
        printf("\n Stack is Overflow");
    }
    else{
        printf("\n Enter the element");
        scanf("%d",&val);
        if(top==NULL)
        {
            ptr->info=val;
            ptr->next=NULL;
            top=ptr;
        }
        else
        {
            ptr->info=val;
            ptr->next=top;
            top=ptr;
        }
        printf(" The Element %d is pushed",val);
    }
}

void pop()
{

    int item;
    node *ptr;
    if(top==NULL)
    {
        printf("\n Stack is Underflow ");
    }
    else{
        item=top->info;
        ptr=top;
        top=top->next;
        free(ptr);
        printf("\n The Element %d is deleted !! ",item);

    }
}
void pip()
{
    
     node *ptr;
    ptr=top;
    if(ptr== NULL)
    {
        printf("\n The stack is empty !!!");

    }
    else{
        printf("\n The Stack is : \n");
        while(ptr!=NULL)
        {
            printf("\n\t| %d |",ptr->info);
            ptr =ptr->next;
        }
    }
}


