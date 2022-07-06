
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in= new Scanner(System.in); 
	    int r=in.nextInt(); 
	   while(r>0){
		 String s= in.next(); 
		 String t= in.next();
		
		if(s.length()<t.length()){
		    check(s,t);
		}else{
		    check(t,s);
		}
		r--;
	   }
	}
	public static void check(String l, String h){
	    int c=0;
	    String ans=new String();
	    for(int i=0; i<lcm(l.length(),h.length()); i++){
	        ans=ans+h.charAt(c);
	        c++;
	        if(c>h.length()-1) c=0;
	    }
	    c=0;
	    for(int i=0; i<ans.length(); i++){
	        if(l.charAt(c)!=ans.charAt(i)){
	            System.out.println("-1");
	            return;
	        }
	        c++;
	        if(c>l.length()-1) c=0;
	    }
	    System.out.println(ans);
	}
	public static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    public static int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }
}
