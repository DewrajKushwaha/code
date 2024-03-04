#include<stdio.h>
#define MAX 10
int arr[MAX];
int top1=-1;
int top2=MAX;

void push(int stkno,int val)
{
    if (top1 +1==top2)
    {
        printf(" Stack is Overflow");
        return ;
    }
    if (stkno==1)       
    {
        arr[++top1]=val;
    }
    else if (stkno ==2)
    {
        arr[--top2]=val;
    }
    else{
        printf("Invalid stack number ");
    }    
}

int pop(int stkno)
{
    if (stkno ==1)
    {
        if (top1==-1)
        {
            printf("Stack 1 is Underflow");
            return -1;
        }
        return arr[top1--];
        
    }else if (stkno ==2)
    {
        if (top2==MAX)
        {
            printf(" \n Stack 2 is Underflow");
            return -1;
        }
        return arr[top2++];
        
    }
    else{
        printf("\n Invalid stack number ");
        return -1;
    }
    
    
}
void display()
{
    printf("\n The stack 1 is :");
    for (int i = 0; i <=top1; i++)
    {
       printf("\n \t| %d |",arr[i]);
    }
    printf("\n The stack 2 is :");
    for (int i = MAX-1; i>= top2; i--)
    {
       printf("\n \t| %d |",arr[i]);
    }
    
} 

int main()
{
    int choice,stkno,val;
    do
    {
        printf("\n Press 1 for Push");
        printf("\n Press 2 for Pop");
        printf("\n Press 3 for display");
        printf("\n Press 4 for Exit");
        printf("\n Enter your choice");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            printf("\n Enter stack number( 1 or 2) ");
            scanf("%d",&stkno);
            printf("\n Enter the value :");
            scanf("%d",&val);
            printf("\n The %d is pushed in stack %d",val,stkno);
            push(stkno,val);
            break;
        case 2:
            printf("\n Enter stack number(1 or 2) ");
            scanf("%d",&stkno);
            printf("\n Popped element is %d ",pop(stkno));
            break;
        case 3 : 
            printf("\n The stack is ");
            display();

        case 4:
            printf("\n Exiting!!!!!!");
            break;
        
        default:printf("\n Invalid choice ");
            break;
        }

    } while (choice !=4);
    
    return 0;
    
}