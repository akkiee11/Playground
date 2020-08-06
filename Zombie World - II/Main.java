#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
    int b,player;
    int arr[b];
  cin>>player>>b;
  for(int i=0;i<b;i++)
  {
    cin>>arr[i];
  }
  sort(arr,arr+b);
  for( int i=0; i<b;i++)
  {
    player-=(arr[i]%2+arr[i]/2);
  }
  if(player>=0)
    cout<<"YES";
  else
    cout<<"NO";
  
  cout<<"\n";
    
    return 0;
}