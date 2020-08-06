#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, k, count = 0;
    cin >> n >> k;
    vector<int> v1;
    for (int i = 1; i < sqrt(n); i++)
    {
        if (n % i == 0)
        {
            count++;
            v1.push_back(i);
            if (count == k)
            {
                cout << n / i;
            }
        }
    }
    if (count * 2 <= k || k <= 0)
    {
        cout << "1";
        return 0;
    }

    if (k > count)
    {
        cout << v1[v1.size() - (k - count)];
    }

    return 0;
}