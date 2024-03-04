#include <stdio.h>
#include <conio.h>
#define MAX 100

int partition(int Q[], int l, int r)
{
    int d = Q[l];
    int i = l + 1;
    int j = r;
    do
    {

        while (Q[i] <= d)
        {
            i++;
        }
        while (Q[j] > d)
        {
            j--;
        }
        if (i < j)
        {
          int  swap = Q[i];
            Q[i] = Q[j];
            Q[j] = swap;
        }

    } while (i < j);
     int swap = Q[l];
     Q[l] = Q[j];
     Q[j] = swap;

     return j;
}
void quickSort(int Q[], int l, int r)
{
    if (l < r)
    {
        // index of pivot after partition
       int  d = partition(Q, l, r);
        quickSort(Q, l, d - 1); // sort left sub array
        quickSort(Q, d + 1, r); // sort right sub array
    }
}
int main()
{
    int Q[MAX], l,i, r, d, n;
    int swap;
    printf("\n Enter the number of element");
    scanf("%d", &n);
    printf("\n Enter %d number", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &Q[i]);
    }
    quickSort(Q, 0,  n-1);
    printf("\n Sorted array is : ");
    for (i = 0; i < n; i++)
    {
        printf(" ----->%d", Q[i]);
    }
    return 0;
}