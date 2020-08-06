#include <bits/stdc++.h>
using namespace std;

int is_prime(int n)
{
    if (n <= 3)
    {
        return 1;
    }
    for (int i = 2; i <= sqrt(n); i++)
    {

        if (n % i == 0)
        {
            return 0;
        }
    }
    return 1;
}

int concat(int a, int b)
{
    if (b < 10)
    {
        return (a * 10)+b;
    }

    return (a * 100)+b;
}

int main()
{
    int n, j = 0, count = 0;
    cin >> n;
    int arr[70];
    set <int > s1;
    for (int i = 2; i <= n; i++)
    {
        if (is_prime(i))
        {
            arr[j++] = i;
        }
    }

    for (int i = 0; i < j; i++)
    {
        for (int k = i + 1; k < j; k++)
        {
            if (i == k)
            {
                continue;
            }
            int concat_1 = concat(arr[i], arr[k]);
            int concat_2 = concat(arr[k], arr[i]);
            if(is_prime(concat_1))
              s1.insert(concat_1);
              if( is_prime(concat_2))
               s1.insert(concat_2);

        }
    }
  count=s1.size();
    cout << count;

    return 0;
}
