#include <stdio.h>
#include <stdlib.h> 

int num,arr[50];
void display()
{
    int i;
    printf("\n The element in array is :");
    for (i = 0; i <num; i++)
    {
        printf("---->%d",arr[i]);
    }
}
void delete()
{
    int i,n,found=0;
    
    printf("\n Enter element for delete :");
    scanf("%d",&n);
    for ( i = 0; i < num; i++)
    {
        if (n == arr[i])
        {
            found=1;
            break;
        }
        
    }
   if (found==1) {
        for (i= i; i <num; i++) {
            arr[i] = arr[i + 1];
        }
        num--;
        printf("Element %d deleted successfully.\n",n);
    } else {
        printf("Element %d not found in the array.\n",n);
    }
} 
void insert()
{
    int i,pos,n;
    printf("\n Enter the postion you want to insert :");
    scanf("%d",&pos);
    
    printf("\n Enter the element :");
    scanf("%d",&n);
    if (pos< 0 || pos >num) {
        printf("Invalid position!\n");
        return;
    }
    for ( i = num-1; i>=pos; i--)    
    {
        arr[i+1]=arr[i];
    }
    arr[pos]=n;
    num ++;

} 
void create()
{
    int  i;
    printf("\n Enter the size of array : ");
    scanf("%d", &num);
    printf("\n Enter the %d element in array", num);
    for (i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);
    }
    
}
int main()
{

    int ch = 0,num, arr[50];
    do
    {

        printf(" \n ########### \033[1m Welcome in the Array World \033[0m ######## ");
        printf(" \n Press 1 . for  Create an Array ");
        printf(" \n Press 2 . for  Insert element in  Array ");
        printf(" \n Press 3 . for  Delete  element in  Array ");
        printf(" \n Press 4 . for  Display  the element of  Array ");
        printf(" \n Press 5 . for  Exit from  Array ");
        printf(" \n \33[3m Enter your choice. \n \33[0m  ");
        scanf("%d", &ch);
        switch (ch)
        {

        case 1:
            create();
            break;

        case 2:
            insert();
            break;

       case 3:
            delete ();
            break; 

        case 4:
            display();
            break;

        case 5:
            exit(0);
            break;

        default:
            printf("\n invalid selection ");
            break;
        }
    } while (ch != 0);
}