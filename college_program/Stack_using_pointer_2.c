#include<stdio.h>
#include<stdlib.h>
#define size 5
struct Stack_using_pointer_2
{
    int top;
    int data[size];
};
typedef struct Stack_using_pointer_2 STRUCT; 

void push(STRUCT *S,int item)
{
    if (S->top==-1 )
    {   printf("\n Stack Overflow");
    }
    else
    {
        S->top=S-> top +1;
        S->data[S->top]=item;
    }
    
} 
int main()
{
    int i,*S,item,ch=0;
    do
    {
    printf("\n 1.push");
    printf("\n 2.pop");
    printf("\n 3.pip");
    printf("\n 4.exit");
    printf("\n Enter your choice");
    scanf("%d",&ch);

    switch (ch)
    {
    case 1:
        printf("\n Enter the element");
        scanf("%d",&item);
        push(&S,item);
        break;
    case 4: exit (0); break;
    
    default:
        break;
    }
    } while (ch !=0);
}
