#include <stdio.h>

int
main ()
{
  int prod = 1, n;
  printf ("Enter a no. ");
  scanf ("%d", &n);
  for (int i = 1; i <= n / 2 + 1; i++)
    {
      for (int j = 1; j <= i; j++)
	printf ("* ");
      printf ("\n");
    }
  if (n % 2 == 0)
    {
      for (int i = n / 2; i <= n; i++)
	{
	  for (int j = 1; j <= n - i; j++)
	    printf ("* ");
	  printf ("\n");
	}
    }
  else
    {
      for (int i = n / 2; i <= n; i++)
	{
	  for (int j = 1; j <= n + 1 - i; j++)
	    printf ("* ");
	  printf ("\n");
	}
    }


  return 0;
}
