#include<iostream>
using namespace std;

int main()
{
  int n,k,a,b,count=0;
  cin>>n>>k;
  int arr[n+1];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<k;i++)
  {
    cin>>a>>b;
    for(int i=0;i<n;i++)
    {
      if(arr[i]>=a && arr[i]<=b)
      {
        count++;
      }
    }
    cout<<count<<" ";
    count=0;
  }
  return 0;
}