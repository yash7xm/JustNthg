import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
      System.out.println ("Enter length of an array: ");
    int len = in.nextInt ();
    int[] arr = new int[len];
      System.out.println ("Enter array elements: ");
    for (int i = 0; i < len; i++)
      {
	arr[i] = in.nextInt ();
      }
    System.out.println (Arrays.toString (arr));
    int count = 0;
    int k = len - 1;
    for (int i = 0; i < len - 1; i++)
      {

	for (int j = i + 1; j < len; j++)
	  {

	    if (arr[i] > arr[j])
	      {
		count++;
	      }
	    if (count == k)
	      {

		System.out.printf ("%d is the leader\n", arr[i]);
	      }
	  }
	k--;
	count = 0;
      }
  }
}
