#include <stdio.h>
#define MAX 100
int main()
{
    int l,u, mid, i, n, se, Q[MAX];
    printf("\n Enter the no. of element ");
    scanf("%d", &n);
    printf("\n Enter the %d element in ASC order :",n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &Q[i]);
    }
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
    if (flag == 1)
    {
        printf("\n Element present at %d position ", (mid + 1));
    }
    else
    {
        printf("\n Element not found ");
    }
    return 0;

}