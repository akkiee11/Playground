    #include<bits/stdc++.h>
    using namespace std;

    int main()
    {
    int t;
    cin>>t;
    while(t--)
    {
        string str1,str2,result="";
        int len1,len2,frequency[256]={0};
        cin>>str1;
        cin>>str2;
        len1=str1.size();
        len2=str2.size();
        for(int i=0;i<len2;i++)
        {
            frequency[str2[i]]++;
        }

        for(int i=0;i<len1;i++)
        {
            if(frequency[str1[i]]!=0)
            {
                while(frequency[str1[i]]--)
                {
                    result=result+str1[i];
                }

            }
        }

    cout<<result<<endl;

    }
    return 0;
    }