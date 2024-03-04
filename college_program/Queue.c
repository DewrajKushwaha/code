#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

#define MAX 100

int value;
int ch, f = -1, r = -1, Q[MAX];

void insertion()
{
    do
    {
        printf("\n Enter the element in queue: ");
        scanf("%d", &value);

        if (r == MAX - 1)
        {
            printf("\n Queue is Overflow");
            return;
        }

        if (f == -1 && r == -1)
        {
            f = 0;
            r = 0;
            Q[r] = value;
        }
        else
        {
            r = r + 1;
            Q[r] = value;
        }

        printf("\n Want to insert more elements? (yes-1/no-0): ");
        scanf("%d", &ch);
    } while (ch != 0);

    getch();
}

void deletion()
{
    do
    {
        if (f > r || f == -1)
        {
            printf("\n Queue is underflow");
        }
        else
        {
            printf("\n Deleted element is %d", Q[f]);
            f = f + 1;
        }

        printf("\n Want to delete more elements? (yes-1/no-0): ");
        scanf("%d", &ch);
    } while (ch != 0);
}

void display()
{
    int i;

    if (f > r || f == -1)
    {
        printf("\n Queue is empty");
        return;
    }

    printf("\n Elements in the queue:\n");
    for (i = f; i <= r; i++)
    {
        printf("%d\n", Q[i]);
    }
}

int main()
{
    int choice;

    do
    {
        printf("Queue Operations:\n");
        printf("1. Insert element in Queue \n");
        printf("2. Delete the element from Queue  \n");
        printf("3. Display the Queue element \n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            insertion();
            break;
        case 2:
            deletion();
            break;
        case 3:
            display();
            break;
        case 4:
            printf("Exiting...\n");
            exit(0);
        default:
            printf("Invalid choice. Please try again.\n");
        }
    } while (1);

    return 0;
}
