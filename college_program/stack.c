#include <stdio.h>
#include <stdlib.h>
#define MAX 5
int main()
{
    int stk[MAX], T, i, ch;
    T = -1;
    do
    {
        printf("\n ####### Stack #######");
        printf("\n\n Press 1. Push Opreation ");
        printf("\n Press 2. Pop Opreation ");
        printf("\n Press 3. Pip or Display Opreation ");
        printf("\n Press 4. Exit");
        printf("\n Enter the choice :");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            T++;
            if (T< MAX - 1)
            {
                printf("\n Enter the value in Stack ");
                scanf("%d", &stk[T]);
            }
            else
            {
                printf("\n Stack Overflow");
            }
            break;
        case 2:
            if (T < 0)
            {
                printf("\n Stack Underflow");
            }
            else
            {
                printf("\n Popped element is %d", stk[T]);
                T--;
            }
            break;
        case 3:
            printf("\n Element in stack");
            for (i = 0; i <= T; i++)
            {
                printf("\n |%d|", stk[i]);
            }
            break;
        case 4: printf("Exiting ....");
               exit(0);
            break;

        default: printf("\n Invalid Selection ");
            break;
        }
    } while (ch !=4);
    return 0;
}
