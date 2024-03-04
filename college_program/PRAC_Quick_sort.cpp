#include <iostream>
#define MAX 50
using namespace std;
int main()
{
    // step 1
    int l, r, d, Q[MAX], i, num, swap, j;
    cout << "\n Enter the total number you want sort : ";
    cin >> num;
    cout << "\n Enter " << num << " number";
    for (i = 0; i < num; i++)
    {
        cin >> Q[i];
    }

    // step 2
    d = Q[MAX - 1];
    l = first; // l=j
    r = MAX - 2;
    // step 3
    do
    {
        while (Q[l] < d)
        {
            l++;
        }
        while (Q[r] > d)
        {
            r--;
        }
        if (l < r)
        {
            swap = Q[l];
            Q[l] = Q[r];
            Q[r] = swap;
        }
    }while (l<r);
    swap=Q[l];
    Q[l]=d;
    d=swap;
    

    return 0;
}