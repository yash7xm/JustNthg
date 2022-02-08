import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
      System.out.println ("Enter length of Array: ");
    int n = in.nextInt ();
    int[] arr = new int[n];

      System.out.println ("Enter Array Elements: ");
    for (int i = 0; i <= n - 1; i++)
      {
	arr[i] = in.nextInt ();
      }
    System.out.println ("Enter the required no. ");

    int target = in.nextInt ();


    for (int i = 0; i < arr.length - 1; i++)
      {
	for (int j = 1; j < arr.length; j++)
	  {
	    if (arr[i] + arr[j] == target && arr[i] != arr[j])
	      {
		System.out.printf ("[%d , %d] \n", arr[i], arr[j]);

	      }
	    else
	      {
		System.out.println ("NO Data here fk off");
	      }
	  }
      }
  }
}
