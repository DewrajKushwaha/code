#include <stdio.h>
#include <stdlib.h>
#define null 0

struct clinkedlist
{
    int info;
    struct clinkedlist *next;
};
typedef struct clinkedlist node;

struct node *create(node *start)
{
    node *temp, *prev;
    int x, ch;
    do
    {
        printf("\n Enter the value of node ");
        scanf("%d", &x);
        temp = (node *)malloc(sizeof(node));
        temp->info = x;
        temp->next = null;
        if (start == null)
        {

            start = temp;
            temp->next = start;
        }
        else
        {
            prev->next = temp;
            temp->next = start;
        }
        prev = temp;
        printf("\n Want to add more node (y=1 or n=0)");
        scanf("%d", &ch);

    } while (ch != 0);
    return start;
}
void display(node *start)
{
    node *temp;
    temp = start;
    do
    {
        printf("--->%d", temp->info);
        temp = temp->next;
    } while (temp != start);
    printf("\n");
}
/* int main()
 {
     node *start = null;
     start = create(start);
     printf("The Circular lInked List is : ");
     display(start);

     return 0;
 } */
int main()
{
    struct node *start, *prev, *temp;
    int c = 0;
    do
    {
        printf("\n -----Circular Linked List-----");
        printf("\n -----Enter your choice-----");
        printf("\n -----Enter 1 : for Creation-----");
        printf("\n -----Enter 2 : for Display-----");
        printf("\n -----Enter 3 : for Exit -----");
        scanf("%d", &c);

        switch (c)
        {
        case 1:
            start = create(start);
            break;
        case 2:
            start = display(start);
            break;
        case 3:
            exit(0);
            break;

        default:
            printf("\n Invilied Selection") break;
        }
    } while (c == 0);
    getch();
}