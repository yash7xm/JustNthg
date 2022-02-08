#include <stdio.h>

int main()
{
    int prod=1,n;
    printf("Enter a no. ");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        prod=prod*i;
    }
    printf("%d",prod);
    

    return 0;
}
