import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
			int[][] arr={{9,4,3,1,6,8,2,5,7},
	                             {6,1,5,9,7,2,4,3,8},
	                             {7,2,8,5,4,3,9,6,1},
	                             {8,6,7,2,1,9,3,4,5},
	                             {3,9,4,8,5,7,6,1,2},
	                             {1,5,2,4,3,6,7,8,9},
	                             {2,3,9,6,8,1,5,7,4},
	                             {4,7,1,3,9,5,8,2,6},
	                             {5,8,6,7,2,4,1,9,3}};
		    
		    
		      int a=0,b=0,c=0,d=0,g=0,f=0;
	           
	       //   Checking The First Two Conditions Here
	                     for(int i=0;i<9;i++){
	                        
	                              c=check_for_duplicates_in_row(arr,i);
	                              if(c>0) break;
	                              d=check_for_numbers_in_row(arr,i);
	                             if(d>0) break;
	                              g=check_for_duplicates_in_col(arr,i);
	                              if(g>0) break;
	                              f=check_for_numbers_in_col(arr,i);
	                              if(f>0) break;
	                         
	                     }
	                     
	                   //  Checking The Last Condition Here
		    
			for(int l=0;l<3;l++){
			    int st=3*l;
			    int en=3*(l+1);
			    for(int k=0;k<3;k++){
			        int s=3*k;
			        int e=3*(k+1);
			        for(int i=st;i<en;i++){
			            for(int j=s;j<e;j++){
			                 a=check_for_duplicates(arr,st,en,s,e);
			                 b=check_for_numbers(arr,st,en,s,e);
			                
			            }
			        }
			    }
			}
			if(a==0&&b==0&&c==0&&d==0&&g==0&&f==0){
			System.out.println("True");
			}
			else
			System.out.println("False");
			
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
		static int check_for_duplicates_in_row(int[][] arr,int i){
	    	ArrayList<Integer> list=new ArrayList<>(3*arr.length);
    	
    	    for(int j=0;j<9;j++){
    	        list.add(arr[i][j]);
    	    }
    
    	Collections.sort(list);
    	int count=0;
    	for(int k=0;k<list.size()-1;k++){
    	    if(list.get(k)==list.get(k+1)){
    	        count++;
    	        break;
    	    }
    	}
    	return count;
}
	static int check_for_numbers_in_row(int[][] arr,int i){
			int count=0;
			
			    for(int j=0;j<9;j++){
			        if(arr[i][j]<=0||arr[i][j]>9){
			            count++;
			            
			        }
			    }
			
			return count;
	}
		static int check_for_duplicates_in_col(int[][] arr,int i){
	    	ArrayList<Integer> list=new ArrayList<>(3*arr.length);
    	
    	    for(int j=0;j<9;j++){
    	        list.add(arr[j][i]);
    	    }
    
    	Collections.sort(list);
    	int count=0;
    	for(int k=0;k<list.size()-1;k++){
    	    if(list.get(k)==list.get(k+1)){
    	        count++;
    	        break;
    	    }
    	}
    	return count;
}
	static int check_for_numbers_in_col(int[][] arr,int i){
			int count=0;
			
			    for(int j=0;j<9;j++){
			        if(arr[j][i]<=0||arr[j][i]>9){
			            count++;
			            
			        }
			    }
			
			return count;
	}
}
			
			
	
