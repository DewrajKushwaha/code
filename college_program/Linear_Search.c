#include<stdio.h>
#include<conio.h>
#define MAX 100
void main()
{
    int Q[MAX],n,i,se,flag=0;
    printf("\n Enter number of element : ");
    scanf("%d",&n);
    printf("\n Enter %d element",n);
    for ( i = 0; i <n; i++)
    {
        scanf("%d",&Q[i]);
    }
    printf("\n Enter the searching element: ");
    scanf("%d",&se);
    for ( i = 0; i <n; i++)
    {
        if (se ==Q[i])
        {
            flag=1;
            break;
        }
        
    }
    if(flag == 1)
    {
        printf("\n Element is founded !!!! ");
        printf("\n Element is present %d at position ",(i+1));

    }
    else
    {
        printf("\n Element not found");
    }
    getch();
}