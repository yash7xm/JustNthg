import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t>0){
	        int n=in.nextInt();
	        int[] a=new int[2*n];
	        for(int i=0; i<2*n; i++){
	            a[i]=in.nextInt();
	        }
	        int dis=0;
	        for(int i=0; i<2*n; i+=2){
	            dis+=2*(a[i]+a[i+1]);
	        }
	        System.out.println(dis);
	        t--;
	    }
	}
}
