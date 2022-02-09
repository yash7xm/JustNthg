import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);

      System.out.println ("Enter length of 1st array: ");
    int len1 = in.nextInt ();
    int[] arr1 = new int[len1];
      System.out.println ("Enter array elements: ");
    for (int i = 0; i < len1; i++)
      {
	arr1[i] = in.nextInt ();
      }
    System.out.println (Arrays.toString (arr1));

    System.out.println ("Enter length of 2nd array: ");
    int len2 = in.nextInt ();
    int[] arr2 = new int[len2];
    System.out.println ("Enter array elements: ");
    for (int i = 0; i < len2; i++)
      {
	arr2[i] = in.nextInt ();
      }
    System.out.println (Arrays.toString (arr2));

    for (int i = 0; i < len1; i++)
      {
	for (int j = 0; j < len2; j++)
	  {

	    if (arr1[i] == arr2[j])
	      {
		System.out.println (arr1[i]);
	      }

	  }
      }
  }
}
