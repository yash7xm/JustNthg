import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		String[] s={"a","b","c"};
		int[] a=new int[s.length];
		String[] ans=new String[s.length];
		permu(s,ans,a,0);
	}
	public static void permu(String[] s,String[] ans,int[] a,int k){
	    if(k==s.length){
	        System.out.println(Arrays.toString(ans));
	        return;
	    }
	    for(int i=0; i<s.length; i++){
	        if(a[i]==0){
	            ans[k]=s[i];
	            a[i]=1;
	            permu(s,ans,a,k+1);
	            a[i]=0;
	        }
	    }
	}
}
