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
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<len-1;i++){
        if(arr[i]<0){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        else{
            if(min>arr[i]){
                min=arr[i];
            }
        }
    }
    System.out.printf("Sum of %d and %d is closest to zero", max,min);
    
  }
} 
