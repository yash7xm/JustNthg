
#include <stdio.h>

int
main ()
{
  int a, b, HCF;
  printf ("Enter two Numbers: \n");
  scanf ("%d %d", &a, &b);
  int min = a < b ? a : b;
  for (int i = 1; i <= min; i++)
    {
      if (a % i == 0 && b % i == 0)
	HCF = i;
    }
  printf ("The HCF of %d and %d is %d", a, b, HCF);
  return 0;
}
