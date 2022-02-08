import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Enter the no: ");
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
      System.out.println (sqrt (n));
  }
  static int sqrt (int x)
  {
  int sqt = 0;
        int s = 0;
        int e = x;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid <= x/mid){
                sqt = mid;
                s = mid+1;
            }else{
                e = mid -1;
            }
        }
        return sqt;
        
    }
  }
