#include<stdio.h>
#include<conio.h>
#define MAX 100
void main()
{
    int Q[MAX],j,i,t,n;
    printf("\n Enter the number of element to be taken :");
    scanf("%d",&n);
    printf("\n Enter %d element ",n);
    for ( i = 0; i <n; i++)
    {
        scanf("%d",&Q[i]);
    }
    for ( i = 0; i <n-1; i++)
    {
        for ( j= i+1; j <n; j++)
        {
            if(Q[i]>Q[j])
            {
                t=Q[i];
                Q[i]=Q[j];
                Q[j]=t;
            }
        }
        
    }
    printf("\n Number in sorted order :");
    for ( i = 0; i <n; i++)
    {
        printf("%d ----->",Q[i]);
    }
    // find total no of accurance of a particular number
    int cv=0,cn;
    printf("\n Enter the number you find accurance :");
    scanf("%d",cn);
    for ( i = 0; i <n; i++)
    {
        if (cn==Q[i])
        {
            cv=cv+1;
        }
          
    }
    if(cv==0)
    {
        printf("\n Element not found");
    }
    else
    {
        printf("\n Element found ");
        printf("\n Total no of element= ",cv);

    }
    

    getch();
    
}