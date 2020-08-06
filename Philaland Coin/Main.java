#include<iostream>
using namespace std;

int main()
{
  int t;
  cin>>t;
  while(t--)
  {
    int n,count=0;
    cin>>n;
    while(n>0)
    {
        n=n/2;
        count++;
    }
    cout<<count<<"\n";
  }
  return 0;
}