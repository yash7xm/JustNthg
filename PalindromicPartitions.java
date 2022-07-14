import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        checku(s,"");
	}
	public static void checku(String up,String p){
	    if(up.isEmpty()){
	            check(p,"");
	         return;
	    }
	    char ch=up.charAt(0);
	    checku(up.substring(1),p+ch);
	    checku(up.substring(1),p);
	}
	public static void check(String up,String p){
	    if(up.isEmpty()){
	        if(checkp(p)){
	            System.out.println(p);
	        }
	        return;
	    }
	    char ch=up.charAt(0);
	    check(up.substring(1),p+ch);
	    check(up.substring(1),p);
	}
	private static boolean checkp(String p){
	    int low=0;
	    int high=p.length()-1;
	    while(low<=high){
	        if(p.charAt(low)==p.charAt(high)){
	            low++; high--;
	        }
	        else return false;
	    }
	    return true;
}
}
