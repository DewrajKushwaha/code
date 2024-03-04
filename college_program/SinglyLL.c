
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <malloc.h>
#define null 0
struct SinglyLL
{
   int info;
   struct SinglyLL *next;
};
typedef struct SinglyLL node;
int main()

{
   node *start, *prev, *temp;
   int ch;
   node *create(node *);
   node *insertfp(node *);
   node *insertlp(node *);
   node *deletefp(node *);
   node *deletelp(node *);
   void display(node *);
   do
   {
      printf("\n Singly Linked List");
      printf("\n 1.Creation");
      printf("\n 2.Insertion First Possition");
      printf("\n 3.Insertion Last Possition");
      printf("\n 4.Deletation First Possition");
      printf("\n 5.Deletation Last Possition");
      printf("\n 6.Display");
      printf("\n 7.Exit");
      printf("\n Enter your choice :");
      scanf("%d ", &ch);

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
         display(start);
         break;

      case 7:
         exit(0);
         break;

      default:
         printf(" Invalid Choice");
         break;
      }
   } while (ch != 7);
   getch();
}
// Creation
 
node *create(node *start)
{
   int x, ch1;
   node *temp, *prev;
   do
   {
      printf("\n Enter Value of node ");
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
      printf("\n want to add more node Yes = 1 or No = 0");
      scanf("%d", &ch1);
   } while (ch1 != 0);
   return start;
}
// Insertion fp
node *insertfp (node *start)
{

   node *temp;
   int x;
   printf("\n Enter value of node");
   scanf("%d", &x);
   temp = (node *)malloc(sizeof(node));
   temp->info = x;
   temp->next = start;
   start = temp;
   return start;
}
// Insertation lp
node *insertlp(node *start)
{
   node *temp, *prev;
   int x;
   prev = start;
   do
   {
      prev = prev->next;

   } while (prev->next != NULL);
   printf("\n Enter value of node");
   scanf("%d", &x);
   temp = (node *)malloc(sizeof(node));
   temp->info = x;
   temp->next = NULL;
   prev->next = temp;
   return start;
}
// deleteion fp
node *deletefp(node *start)
{
   node *temp;
   temp = start;
   start = start->next;
   free(temp);
   return start;
}
// deleteion lp
node *deletelp(node *start)
{
   node *prev, *temp;
   prev = NULL;
   temp = start;
   do
   {
      prev = temp;
      temp = temp->next;
   } while (temp->next != NULL);
   prev->next = NULL;
   free(temp);
   return start;
}
// display
void display(node *start)
{
   node *temp;
   temp = start;
   printf("\n Information of Singly Link List");
   do
   {
      printf("%d ", temp->info);
      temp = temp->next;
   } while (temp != NULL);
}
/*
#include <stdio.h>
#include <stdlib.h>
#include<malloc.h>
#define null 0

 
 
struct singly
{
      int info;
      struct singly *next;
};
 typedef struct singly node;
 void main()
 {
   node *start,*prev,*temp;
    int ch;
   start = NULL;
node create(node start);
node insert_fp(node start);
node insert_lp(node start);
node delete_fp(node start);
node delete_lp(node start);
void display(node*);
do
{
     printf("\n Singly Linked List");
     printf("\n----------------------");
    printf("\n 1. Creation");
    printf("\n 2. insertion first position");
    printf("\n 3. insertion last position");
    printf("\n 4. deletion first position");
    printf("\n 5. deletion last position");
    printf("\n 6. display");
    printf("\n 7. Exit");
     
    printf("\n Enter your choice");
    scanf("%d", &ch);
                  
    switch(ch)
    {
        case 1: start = create(start);
           break;
        case 2: start = insert_fp(start);
            break;
        case 3: start = insert_lp(start);
            break;
        case 4: start = delete_fp(start);
            break;
        case 5: start = delete_lp(start);
            break;
        case 6: display(start);
            break;
        case 7: exit(0);
        default:
            printf("\n invalid choice");
            break;
    }
}while(ch !=7);
getch();
}
 
     node* create(node *start)
    {
       
        int x;
        int ch1;
        node*temp,*prev;
        do{
        printf("\n Enter value of node");
        scanf("%d", &x);
        temp = (node*)malloc(sizeof(node));

        temp->info=x;
        temp->next=NULL;
        if(start==NULL)
        {
            
            start = temp;
        }
        else
        {
           prev->next=temp;
           
        }
        prev=temp;
        printf("\n want to add malloc next(y=1/n=0)");
        scanf("%d", &ch1);
        }while(ch1!=0);
            return start;
    }
 
      node *insert_fp(node *start)
    {
         node *temp;
      int x;
    printf("\n Enter value of node");
    scanf("%d",&x);
    temp = (node*)malloc(sizeof(node));
            temp->info=x;
            temp->next=start;
            start=temp;
    return start;
    }
 
     node* insert_lp(node *start)

    {
         node *temp,*prev;
        int x;
        prev=start;
        do{
            prev=prev->next;
        }while(prev->next!=NULL);
        printf("\n Enter value of node");
        scanf("%d", &x);
       temp=(node*)malloc(sizeof(node));
       temp->info=x;
      temp -> next = NULL;
        prev->next=temp;
        return start;
    }
 
     node* delete_fp(node *start)
    {
        node*temp;
        temp=start;
        start=start->next;
         free(temp);
         return start;
    }
 
     node* delete_lp(node *start)
    {
        node*prev,*temp;
        prev=NULL;
        temp=start;
        do
        {
          prev=temp;
          temp=temp->next;
        }while(temp->next!=NULL);
        prev->next=NULL;
        free(temp);
        return start;
    }
 
   void display(node *start)
    {
       node*temp;
       temp=start;
       printf("\n information of singly linked list");
        do
        {
          printf("------>1%d",temp->info);
          temp=temp->next;
        }
       while(temp!=NULL);
    }
 */