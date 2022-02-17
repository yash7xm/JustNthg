import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
			int[][] arr={{1,2,3,4,5,6,7,8,9},
	                     {1,2,3,4,5,6,7,8,9},
	                     {1,2,3,4,5,6,7,8,9},
	                     {1,2,3,4,5,6,7,8,9},
	                     {1,2,3,4,5,6,7,8,9},
	                     {1,2,3,4,5,6,7,8,9},
	                     {1,2,3,4,5,6,7,8,9},
	                     {1,2,3,4,5,6,7,8,9},
	                     {1,2,3,4,5,6,7,8,9}};
		    
			for(int l=0;l<3;l++){
			    int st=3*l;
			    int en=3*(l+1);
			    for(int k=0;k<3;k++){
			        int s=3*k;
			        int e=3*(k+1);
			        for(int i=st;i<en;i++){
			            for(int j=s;j<e;j++){
			                int a=check_for_duplicates(arr,st,en,s,e);
			                int b=check_for_numbers(arr,st,en,s,e);
			                if(a>0||b>0){
			                    System.out.println("false");
			                }
			            }
			        }
			    }
			}
			System.out.println("True");
			
			
			
	}
	static int check_for_duplicates(int[][] arr,int st,int en,int s, int e){
	    	ArrayList<Integer> list=new ArrayList<>(3*arr.length);
    	for(int i=st;i<en;i++){
    	    for(int j=s;j<e;j++){
    	        list.add(arr[i][j]);
    	    }
    	}
    	Collections.sort(list);
    	int count=0;
    	for(int i=0;i<list.size()-1;i++){
    	    if(list.get(i)==list.get(i+1)){
    	        count++;
    	    }
    	}
    	return count;
	}
	static int check_for_numbers(int[][] arr,int st,int en,int s, int e){
			int count=0;
			for(int i=st;i<en;i++){
			    for(int j=s;j<e;j++){
			        if(arr[i][j]<=0||arr[i][j]>9){
			            count++;
			        }
			    }
			}
			return count;
	}
	
}
