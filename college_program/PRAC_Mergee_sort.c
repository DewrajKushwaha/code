#include <stdio.h>
#include <stdlib.h>

int main()
{
    int Q1[100], Q2[100], Q3[100], i, size1, size2, j, k, t, m;
    printf("\n Enter the size of First Array :\n");
    scanf("%d", &size1);
    printf("\n Enter the %d element in first array :\n", size1);
    for (i = 0; i < size1; i++)
    {
        scanf("%d", &Q1[i]);
    }
    printf("\n Enter the size of Second  Array : \n");
    scanf("%d", &size2);
    printf("\n Enter the %d element in Second array : \n ", size2);
    for (i = 0; i < size2; i++)
    {
        scanf("%d", &Q2[i]);
    }
    // Sorting first array using bubble sort technique
    for (i = 0; i < size1 - 1; i++)

    {

        for (j= 0; j< size1 - 1 - i; j++)
        {
            if (Q1[j] > Q1[j + 1])
            {
                t = Q1[j];
                Q1[j] = Q1[j + 1];
                Q1[j + 1] = t;
            }
        }
    }
    // Sorting second array using bubble sort technique
    for (i = 0; i < size2 - 1; i++)
    {

        for (j = 0; j < size2 - 1 - i; j++)
        {
            if (Q2[j] > Q2[j + 1])
            {
                t = Q1[j];
                Q2[j] = Q2[j + 1];
                Q2[j + 1] = t;
            }
        }
    }
    // marge process

    i = 0, j = 0, k = 0;
    if (Q1[i] < Q2[j])
    {
        Q3[k] = Q1[i];
        i++;
        k++;
    }

    else if (Q1[i] > Q2[j])
    {

        while (i != size1 - 1 || j != size2 - 1)
        {
            {
                Q3[k] = Q2[j];
                k++;
                j++;
            }
        }
    }

    else
    {
        Q3[k] = Q1[i];
        k++;
        j++;
        i++;
    }

    if (i != size1 - 1)
    {
        for (m = i; m < size1 - 1; m++)
        {
            Q3[k] = Q1[m];
            k++;
        }
    }
    else
    {
        for (m = i; m < size2 - 1; m++)
        {
            Q3[k] = Q2[m];
            k++;
        }
    }
    // Display the sorted element
    printf("\n The final marge sort is : \n ");
    for (i = 0; i < k; i++)
    {
        printf(" \n %d", Q3[i]);
    }
}