#include<iostream>
using namespace std;

int main()
{
  int n,cnt_five,cnt_two,cnt_one,n1;
  cin>>n;
  cnt_five=(n-4)/5;
  if((n-cnt_five*5)%2==0) //Try to use bracket for Multiple Conditions then and then will get correct output...
  {
      cnt_one=2;
  }
  else
  {
      cnt_one=1;
  }
  cnt_two=((n-cnt_five*5)-cnt_one)/2;
  cout<<cnt_five+cnt_two+cnt_one<<" "<<cnt_five<<" "<<cnt_two<<" "<<cnt_one;


  return 0;
}