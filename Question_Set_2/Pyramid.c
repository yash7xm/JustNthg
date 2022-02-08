#include <stdio.h>

int
main ()
{
  int x, n;
  printf ("Enter no. of rows: ");
  scanf ("%d", &n);
  x = 1;
  for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= n - i; j++)
	{
	  printf (" ");
	}
      for (int k = 1; k <= x; k++)
	{
	  printf ("*");
	}
      x = x + 2;
      printf ("\n");

    }
  return 0;
}
