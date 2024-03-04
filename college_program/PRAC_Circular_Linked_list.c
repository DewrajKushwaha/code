#include <stdio.h>
#include <stdlib.h>

struct PRAC_Circular_Linked_list
{
    int info;
    struct PRAC_Circular_Linked_list *next;
};
typedef struct PRAC_Circular_Linked_list node;
node *creation(node *start)
{
    int value, ch1;
    node *temp, *prev;
    start = NULL;
    do
    {
        printf("\n Enter the value of node : ");
        scanf("%d", &value);

        temp = (node *)malloc(sizeof(node));
        temp->info = value;
        temp->next = NULL;
        if (start == NULL)
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
         printf("\n Want to add more node ? press(yes-1 or no-0)");
         scanf("%d",&ch1);
    } while (ch1 !=0);
    return start;

}
node *insertfp(node *start)
{
    int value;
    node *temp, *prev;
    prev = start;
    printf("\n Enter the value : ");
    scanf("%d", &value);
    temp = (node *)malloc(sizeof(node));
    temp->info = value;
    temp->next = start;
    do
    {
        prev = prev->next;
    } while (prev->next != start);
    prev->next = temp;
    start = temp;
    return start;
}
node *insertlp(node *start)
{
    int value;
    node *temp, *prev;
    prev = start;
    printf("\n Enter the value : ");
    scanf("%d",&value);
    do
    {
        prev = prev->next;
    } while (prev->next != start);
    temp = (node *)malloc(sizeof(node));
    temp->info = value;
    temp->next = start;
    prev->next = temp;
    return start;
}
node *deletefp(node *start)
{
    node *temp, *prev;
    prev = start;
    do
    {
        prev = prev->next;
    } while (prev->next != start);
    temp = start;
    start = start->next;
    free(temp);
    prev->next = start;
    return start;
}
node *deletelp(node *start)
{
    node *temp, *prev;
    prev = start;
    temp = start;
    ;
    do
    {
        prev = temp;
        temp = temp->next;
    } while (temp->next != start);
    prev->next = start;
    free(temp);
    return start;
}
void display(node *start)
{
    node *temp;
    temp = start;
    do
    {
        printf("%d---->", temp->info);
        temp = temp->next;
    } while (temp != start);
}

int main()
{
    int x, ch = 0;
    node *prev, *temp;
    node *start = NULL;
    do{
    printf("\n ####### Welcome to Circular Linked List ########");
    printf("\n Press 1 : for Create Circular Linked List ");
    printf("\n Press 2 : for Insert First Position in Circular Linked List ");
    printf("\n Press 3 : for Insert Last Position in Circular Linked List ");
    printf("\n Press 4 : for Delete from First Position in Circular Linked List ");
    printf("\n Press 5 : for Delete from Last Position in Circular Linked List ");
    printf("\n Press 6 : for Display the Circular Linked List ");
    printf("\n Press 7 : for Exit from Circular Linked List ");
    printf("\n Enter your choice ");
    scanf("%d", &ch);
     

        switch (ch)
        {
        case 1:
            start = creation(start);
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
            printf("\n The Circular Linked List is : ");
            display(start);
            break;
        case 7:
            exit(0);
            break;
        default:
            printf("\n Invalid Choice");
            break;
        }
    } while (ch != 0);
    return 0;
}