#include <stdio.h>
#include<malloc.h>
#include <stdlib.h>
struct node
{
    int info;
    struct node *next;
};
struct node *start = NULL;

void create()
{
    int  ch,x;
    do
       {
           printf("\n Enter the value of singly linked list : ");
           scanf("%d", &x);
           printf("\n Want to add more node (y-1 / n-0)");
           scanf("%d", &ch);
           struct node *temp = (struct node *)malloc(sizeof(struct node));
           temp->info = x;
           temp->next = NULL;


           if (start == NULL)
               {
                   start = temp;
                   return;
               }
           else
               {
                struct node *prev->next = temp;
               }
           struct node *prev = temp;

       } while (ch != 0);
   
}

void insertAtBeg(int value)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->info = value;
    temp->next = start;
    start = temp;
}

void insertAtLast(int value)
{

    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->info = value;
    temp->next = NULL;

    if (start == NULL)
    {
        start = temp;
        return;
    }
    struct node *prev = start;
    while (prev->next != NULL)
    {
        prev = temp->next;
    }
    prev->next = temp;
}
void display()
{
    if (start == NULL)
    {
        printf("\n List is empty.");
        return;
    }
    struct node *prev = start;
    while (prev != NULL)
    {
        printf("%d ---->", prev->info);
        prev = prev->next;
    }
    printf("\n");
}
int main()
{
    int ch, value;
    while (1)
    {
        printf("\n 1.Create ");
        printf("\n 2.Insert at begin ");
        printf("\n 3.Insert at last ");
        printf("\n 4.display ");
        printf("\n 5.exit ");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1: 
            create();
            break;
        case 2:
            printf("\n Enter the value to insert : ");
            scanf("%d", &value);
            insertAtBeg(value);
            break;
        case 3:
            printf("\n Enter the value to insert : ");
            scanf("%d", &value);
            insertAtLast(value);
            break;
        case 4:
            display();
            break;
        case 5:
            exit(0);
        default:
            printf("Inviled Selection ");
        }
    }
    return 0;
}