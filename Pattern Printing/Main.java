#include <iostream>
using namespace std;

int main()
{
    int n, star = 0, space;
    cin >> n;
    int lterm = 1;
    int rterm = n * n + 1;
    for (int i = n; i > 0; i--)
    {
        for (space = 1; space <= star; space++)
        {
            cout << "*";
        }
        star = star + 2;
        for (int j = 1; j <= i; j++)
        {
            cout << lterm << "0";
            lterm++;
        }

        for (int j = 1; j <= i; j++)
        {
            cout << rterm;
            if (j < i)
            {
                cout << "0";
            }
            rterm++;
        }
        rterm = rterm - (i - 1) * 2 - 1;
        cout << endl;
    }
    return 0;
}

