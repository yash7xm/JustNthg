int main()
{
 int n;    
  printf("Enter no. of row: ");
  scanf("%d",&n);
  for(int i=1;i<=n;i++){
      for(int j=1;j<=n+1-i;j++){
          printf("*");
      }
      printf("\n");
  }

    return 0;
}
