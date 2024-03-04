#include <stdio.h>
#include<stdlib.h>
# define size 10

struct stack_using_pointer
{
    int top;
     int data[size];
};
typedef struct stack_using_pointer STACK;

void push(STACK *s , int item)
{
    if (s-> top == size -1 )
    {
        printf("\n Stack is Overflow");
    }
    else
    {
        s->top=s->top +1;
        s->data[s->top]=item;
        // s->data[++(s->top)]=item;
    }
}
int pop(STACK *s)
{
    if(s->top == -1)
    {
        printf("\n Stack underflow");
        return -1;
    }
    else
    {
        return s->data[(s->top)--];
    }
    
}

void display(STACK S)    // because not changes in STACK S so i will not initilase as pointer
{
    if (S.top==-1)
    {   
        printf("\n Stack is empty");
    }
    else{
        printf("\n Stack element are \n ");
        for(int i=S.top;i>=0;i--)
        {
            printf("| %d |\n ",S.data[i]);
        }
    }
    
}
int main ()
{
    STACK S;
    S.top =-1;
    int ch=0;
    int item,del;
    do{
        printf("\n 1. Push ");
        printf("\n 2. Pop ");
        printf("\n 3. Display ");
        printf("\n 4. Exit ");
        printf("\n Enter choice : \n ");
        scanf("%d",&ch);
    switch (ch)
    {
    case 1:
        printf("\n Enter element in stack. ");
        scanf("%d",&item);
        push(&S,item);
        break;
    case 2:del=pop(&S);
        if(del != -1)
        {
            printf("\n Element poped is %d",del);
        }
        break;
    case 3: display(S);
            break;
    case 4:exit(0);
             break;
    default:printf("\n Invalid Selection");
        break;
    }
    }
    while (ch !=0);
}
