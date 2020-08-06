#include <iostream>
using namespace std;

int stair(int n)
{
  int first=1,second=1,sum=0;
  if(n<2)
    return n;
  for(int i=2;i<=n;i++)
  {
    sum=first+second;
    first=second;
    second=sum;
  }
  return sum;
}
int main() 
{
   // Try out your code here
  int n,a;
  cin>>n;
  a=stair(n);
  cout<<a;
  
    return 0;
}