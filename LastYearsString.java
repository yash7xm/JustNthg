import java.util.*;
import java.io.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		while(t>0 && in.hasNext()){
		    int n=in.nextInt();
		    String s=new String();
		    
		    
		        for(int i=0; i<n; i++){
		        s=s+in.next();
		    }
		  
		    
		    char[] arr=new char[n];
		    for(int i=0; i<n; i++){
		        arr[i]=s.charAt(i);
		    }
		    int c=0;
		    if(arr[0]=='2' && arr[n-1]=='0') c++;
		    if(arr[1]=='0' && arr[n-2]=='2') c++;
		   else if(arr[1]=='0' && arr[2]=='2') c++;
		   else  if(arr[n-2]=='2' && arr[n-3]=='0') c++;
		     if(arr[n-2]=='2' && arr[n-3]=='0' && arr[n-4]=='2' && arr[n-1]=='0') c++;
		     if(arr[0]=='2' && arr[1]=='0' && arr[2]=='2' && arr[3]=='0') c++;
		    if(c>=2) System.out.println("YES");
		    else System.out.println("NO");
		   t--;
		}
		
	}
}
