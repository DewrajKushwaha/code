/* #include<stdio.h>
#include<conio.h>
void main()
{
    int a[50],i,size,pos,item;
    printf("Enter the size of array");
    scanf("%d",&size);
    printf("Enter the array element");
    for(i=0;i<size;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the position that you want to add element");
    scanf("%d",&pos);
    printf("Enter the element ");
    scanf("%d",&item);
    {
        a[i]=a[i-1];
    }
    a[pos]=item;
    size ++;
    printf("Result are array element");
    for(i=0;i<size;i++)
    {
        printf("%d",&a[i]);
    }
} */

#include<stdio.h>
#include<conio.h>

void main() {
    int a[50], i, size, pos, item;
    
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    
    printf("Enter the array elements: ");
    for(i = 0; i < size; i++) {
        scanf("%d", &a[i]);
    }
    
    printf("Enter the position where you want to add the element: ");
    scanf("%d", &pos);
    
    printf("Enter the element: ");
    scanf("%d", &item);
    
    for(i = size; i > pos; i--) {
        a[i] = a[i-1];
    }
    
    a[pos] = item;
    size++;
    
    printf("Resulting array elements: ");
    for(i = 0; i < size; i++) {
        printf("%d ", a[i]);
    }
}
