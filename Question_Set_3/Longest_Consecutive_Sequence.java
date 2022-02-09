import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter the Length of Array: ");
	    Scanner in=new Scanner(System.in);
	    int len=in.nextInt();
		int[] arr=new int[len];
		 System.out.println("Enter the Elements of Array: ");
		 for(int i=0;i<len;i++){
		     arr[i]=in.nextInt();
		 }
	
		
		for(int i=0;i<len-1;i++){
		    for(int j=1;j<len-i;j++){
		        if(arr[j]<arr[j-1]){
		            int temp=arr[j];
		            arr[j]=arr[j-1];
		            arr[j-1]=temp;
		        }
		        
		    }
		}
		ArrayList<Integer> list=new ArrayList<>(len);
		int count=1;
		int ans=0;
		for(int i=0;i<len-1;i++){
		    if(arr[i]!=arr[i+1]){
		        list.add(arr[i]);
		    }
		}
		for(int i=0;i<list.size()-1;i++){
		    if(list.get(i+1)==list.get(i)+1){
		        count++;
		    }
		    else 
		    count=1;
		    ans=Math.max(ans,count);
		}
		
		System.out.println(ans);
	}
}
