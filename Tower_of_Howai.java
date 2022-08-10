import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
        ToH(1,1,2,3);
        }
    public static void ToH(int t, int A, int B, int C){
        if(t>0){
           
        ToH(t-1,A,C,B);
         System.out.printf("%d to %d",A,C);
            System.out.println();
        ToH(t-1,B,A,C);
    }else return;
  }
}
