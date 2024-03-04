
#include<stdio.h>
#include<conio.h>
#define MAX 100
int main()
{
    int Q[MAX],i,n,u,l,se,mid;
    printf("\n Enter the number of element ");
    scanf("%d",&n);
    printf("\n Enter the %d element ",n);
    for (  i= 0; i<n;i++)
    {
        scanf("%d",&Q[i]);
    }
    //sorting process using selection sort
    for ( i = 0; i <n-1; i++)
    {
        for (int j= i+1; j <n; j++)
        {
            if(Q[i]>Q[j])
            {
            int t=Q[i];
                Q[i]=Q[j];
                Q[j]=t;
            }
        }
        
    }
    //searching  process
    /*
    Q[i]
    */
    printf("\n Enter the seaching element");
    scanf("%d",&se);
    l = 0;
    u = n - 1;
    int flag = 0;
    while (l <= u)
    {
        mid = (l + u) / 2;
        if (se > Q[mid])
        {
            l = mid + 1;
        }
        else if (se < Q[mid])
        {
            u = mid - 1;
        }
        else
        {
            flag = 1;
            break;
        }
    }
    printf("\n Number in sorted order :");
    for ( i = 0; i <n; i++)
    {
        printf("%d ----->",Q[i]);
    }
    if (flag == 1)
    {
        printf("\n Element present at %d position ", (mid+1));
    }
    else
    {
        printf("\n Element not found ");
    }
    return 0;
}

