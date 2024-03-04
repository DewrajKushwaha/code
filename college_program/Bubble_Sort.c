#include<stdio.h>
#include<stdlib.h>
#define MAX 100
int main()
{ 
    int Q[MAX],i,t,j,n;
    printf("\n Enter the number to taken ");
    scanf("%d",&n);
    printf("\n Enter %d element : ",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&Q[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<=n-2;j++)
        {
            if(Q[j]>Q[j+1])
            {
                t=Q[j];
                Q[j]=Q[j+1];
                Q[j+1]=t;
            }
        }
    }
    printf("\n Number is sorted order in Asc order : ");
    for(i=0;i<n;i++)
    {
        printf("%d ---->",Q[i]);
    }
    return 0;
} 

 