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
    printf("\n Enter the number for count repated time ");
    int cv;
    int count=0;
    scanf("%d",&cv);
    for ( i = 0; i <n; i++)
    {
        for (int j = 0; j <i; j++)
        {
            if (Q[i]==Q[j])
            {
              count++;
            }
            
        }
        
        
    }
    printf("\n The number %d is present = %d time",cv,count);
    
    getch();
}