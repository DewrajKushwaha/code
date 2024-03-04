#include<stdio.h>
#include<stdlib.h>
#define MAX 50
int main()
{
    int se,i,num,arr[MAX],count;
    printf("\n Enter the size of array");
    scanf("%d",&num);
    printf("\n Enter the %d element ",num);
    for(i=0;i<num;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("\n Enter the element to find the occurence number");
    scanf("%d",&se);
    for(i=0;i<num;i++)
    {
        if(se==arr[i])
        {
            count=count+1;
        }
    }
    if(count==0)
    {
        printf("\n Element not founded!!");
    }
    else{
        printf("\n Element found");
        printf("\n Total occurence is = %d",count);
    }
    return 0;
}
