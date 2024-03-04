#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define SIZE 20

struct Stack
{
    int top;
    char data[SIZE];
};
typedef struct Stack STACK;

void push(STACK *s, char item)
{
    s->top++;
    s->data[s->top] = item;
}

char pop(STACK *s)
{
    return s->data[s->top--];
}

int stack_preced(STACK *s)
{
    char top_operator = s->data[s->top];
    switch (top_operator)
    {
        case '^':
            return 5;
        case '*':
        case '/':
            return 3;
        case '+':
        case '-':
            return 1;
        default:
            return 0;
    }
}

int preced(char symbol)
{
    switch (symbol)
    {
        case '^':
            return 4;
        case '*':
        case '/':
            return 2;
        case '+':
        case '-':
            return 1;
        default:
            return 0;
    }
}

void infixtopostfix(char infix[20], STACK *s)
{
    char postfix[20], symbol, temp;
    int i, j = 0;
    for (i = 0; infix[i] != '\0'; i++)
    {
        symbol = infix[i];
        if (isalnum(symbol))       //check alpha num
        {
            postfix[j++] = symbol;
        }
        else
        {
            switch (symbol)
            {
                case '(':
                    push(s, symbol);
                    break;
                case ')':
                    temp = pop(s);
                    while (temp != '(')
                    {
                        postfix[j++] = temp;
                        temp = pop(s);
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    if (s->top == -1 || s->data[s->top] == '(')
                    {
                        push(s, symbol);
                    }
                    else
                    {
                        while (stack_preced(s) >= preced(symbol) && s->top != -1 && s->data[s->top] != '(')
                        {
                            postfix[j++] = pop(s);
                        }
                        push(s, symbol);
                    }
                    break;
                default:
                    printf("\n Invalid expression");
                    break;
            }
        }
    }
    while (s->top != -1)
    {
        postfix[j++] = pop(s);
    }
    postfix[j] = '\0';
    printf("\n postfix expression is = %s", postfix);
}

int main()
{
    char infix[20];
    STACK s;
    s.top = -1;
    printf("\n Read infix expression \n");
    scanf("%s", infix);
    infixtopostfix(infix, &s);
    return 0;
}
