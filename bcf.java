import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t>0){
	        int n=in.nextInt();
	        int[] a=new int[n];
	        for(int i=0; i<n; i++) a[i]=in.nextInt();
	        int min=Integer.MAX_VALUE;
	        for(int i=0; i<n; i++){
	            if(a[i]<min) min=a[i];
	        }
	        int sum=0,c=0;
	        for(int i=0; i<n; i++){
	            if(min==a[i]){
	               sum+=i; c++;
	            } 
	        }
	      int s=c-1;
	      if(s<sum) System.out.println("NO");
	      else System.out.println("YES");
	        t--;
	    }
	}
}
