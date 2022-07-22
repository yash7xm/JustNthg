#include <iostream>

using namespace std;

int main()
{
    int t,n,sum=0;
    cin>>t;
    while(t>0){
        cin>>n;
        int a[n];
        for(int j=0; j<n; j++) cin>>a[j];
        int c=0;
        for(int i=0; i<n; i++){
            if(a[i]==1) c++;
            else(a[i]==0){
                sum=sum+(c*(c+1))/2;
                c=0;
            }
        }
        sum=sum+(c*(c+1))/2;
        cout<<sum<<endl;
        t--;
    }

    return 0;
}
