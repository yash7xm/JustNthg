import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Main
{
  public static void main (String[]args)
  {

    System.out.println ("Enter the Length of Array: ");
    Scanner in = new Scanner (System.in);
    int len = in.nextInt ();
    int[] arr = new int[len];
      System.out.println ("Enter the Elements of Array: ");
    for (int i = 0; i < len; i++)
      {
	arr[i] = in.nextInt ();
      }

    Arrays.sort (arr);
    System.out.println (Arrays.toString (arr));
    ArrayList < Integer > list = new ArrayList <> (arr.length);

    for (int i = 0; i < arr.length - 1; i++)
      {
	if (arr[i] != arr[i + 1])
	  {
	    list.add (arr[i]);
	  }
      }
    list.add (arr[arr.length - 1]);
  for (int i:list)
      {
	System.out.println (i);
      }
    int ans = list.size ();

    System.out.println (ans);
  }
}
