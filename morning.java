import java.util.*;
import java.io.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		while(t>0){
		    int n=in.nextInt();
		    String s=new String();
		    for(int i=0; i<n; i++){
		        s=s+in.next();
		    }
		    System.out.println(s);
		    int c=0;
		    if("2".equals(s.charAt(1)) && "0".equals(s.charAt(n))) c++;
		    if("0".equals(s.charAt(1)) && "2".equals(s.charAt(n-2))) c++;
		   else if("0".equals(s.charAt(1)) && "2".equals(s.charAt(2))) c++;
		   else  if("2".equals(s.charAt(n-2)) && "0".equals(s.charAt(n-3))) c++;
		     if("2".equals(s.charAt(n-2)) && "0".equals(s.charAt(n-3)) && "2".equals(s.charAt(n-4)) && "0".equals(s.charAt(n-1) )) c++;
		     if("2".equals(s.charAt(0)) && "0".equals(s.charAt(1)) && "2".equals(s.charAt(2)) && "0".equals(s.charAt(3))) c++;
		  
		   
		   
		    System.out.println(c);
		    if(c>=2) System.out.println("YES");
		    else System.out.println("NO");
		   t--;
		}
		
	}
