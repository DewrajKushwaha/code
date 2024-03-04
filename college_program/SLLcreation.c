#include <stdlib.h>
#include <stdio.h>
#include<malloc.h>
#include <conio.h>

#define NULL 0

struct SLLcreation
{
    int info;
    struct SLLcreation *next;
};
typedef struct SLLcreation node;

node *create(node *start)
{
    int x;
    int ch1;
    node *temp, *prev;
    do
    {
        /* code */
        printf("\n Enter the value of node");
        scanf("%d", &x);

        temp = (node *)malloc(sizeof(node));

        temp->info = x;
        temp->next = NULL;

        if (start == NULL)
        {
            start = temp;
        }
        else
        {
            prev->next = temp;
        }
        prev = temp;
        printf("\n want to add malloc next Yes press 1 or No press 2");
        scanf("%d", &ch1);
    } while (ch1 != 0);
     return start;
}
