#include<iostream>
using namespace std;

int main()
{
  int t;
  cin>>t;
 
  while(t--)
  {
    string str;
    cin>>str;
    int freq[400]={0};
    bool is_ascii=true;
    int i=0;
    
   while(str[i]!='\0')
   {
     if(str[i]>='a' && str[i]<='z')
     {
       freq[str[i]-'a']++;
     }
     i++;
   }
    
   for(i=0;i<26;i++)
   {
     if(freq[i]>0 && freq[i] != i+1)
     {
       is_ascii=false;
     }
   }
    
   if(is_ascii)
   {
     cout<<"YES"<<" ";
   }
    else
    {
      cout<<"NO"<<" ";
    }
  }
  return 0;
}