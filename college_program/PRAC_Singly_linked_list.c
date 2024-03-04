#include <stdio.h>
#include <stdlib.h>

struct Singly
{
    int info;
    struct Singly *next;
};
typedef struct Singly node;

node *create(node *start)
{
    int x, ch1;
    node *prev, *temp;
    do
    {
        printf("\n Enter value of node \t");
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
        printf("\n want to add more node Yes = 1 , No = 0 \t");
        scanf("%d", &ch1);
    } while (ch1 != 0);
    return start;
}
node *insertfp(node *start)
{
    node *temp;
    int x;
    printf("\n Enter the value of node\t");
    scanf("%d", &x);
    temp = (node *)malloc(sizeof(node));
    temp->info = x;
    temp->next = start;
    start = temp;
    return start;
}
node *insertlp(node *start)
{
    node *temp,*prev;
    int x;
    prev=start;
    do
    {
        prev=prev->next;        
    } while (prev->next !=NULL);
    printf("\n Enter value of node \t ");
    scanf("%d",&x);
    temp=(node*)malloc(sizeof(node));
    temp->info=x;
    temp->next=NULL;
    prev->next=temp;
    return start;
    
}
node *deletefp(node *start)
{
    node *temp;
    temp=start;
    start=start->next;
    free(temp);
    return start;
}
node *deletelp(node *start)
{
    node *temp,*prev;
    prev=NULL;
    temp=start;
    do{
        prev=temp;
        temp=temp->next;
    }while(temp->next != NULL);
    prev->next=NULL;
    free(temp);
    return start;
}
void display(node *start)
{
    node *temp;
    temp = start;
    printf("\n Information of singly linked list");
    while (temp != NULL)
    {
        printf(" ----> %d", temp->info);
        temp = temp->next;
    }
}

int main()
{
    node *prev, *temp;
    int ch = 0;
    int loop;
    node *start = NULL; 

    do
    {
        printf("\n ########### Singly Linked List #############");
        printf("\n 1.Create a New Linked list");
        printf("\n 2. Insert from first position.");
        printf("\n 3.Insert from Last Position ");
        printf("\n 4. Delete from first position. ");
        printf("\n 5. Delete from Last Position ");
        printf("\n 6.Display");
        printf("\n 7. Exit");
        printf("\n Enter your choice\t");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            start = create(start);
            break;
        case 2:
            start = insertfp(start);
            break;
        case 3:
            start = insertlp(start);
            break;
        case 4:
            start = deletefp(start);
            break;
        case 5:
            start = deletelp(start);
            break;
        case 6:
            printf("\n The Linked List is :");
            display(start);
            break;
        case 7:
            exit(0);
            break;

        default:
            printf("\n Invalid choice");
            break;
        }
    } while (ch != 0);
    return 0;
}
