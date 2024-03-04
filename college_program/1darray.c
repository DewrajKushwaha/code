#include<stdio.h>
#include<conio.h>
int main()
{
    int x[5],i;
    printf("Enter the value in array \n");
    for(i=0;i<5;i++)
    {
        scanf("%d",&x[i]);
    }
    printf("The data is : \n");
    for(i=0;i<5;i++)
    {
        printf("%d \n",x[i]);
    }
    return 0;
}