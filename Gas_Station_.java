import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int[] A={1,2};
	    int[] B={2,1};
		int l=0,j=0,rem=0,k=0;
        int[] A1=new int[2*A.length];
        int[] B1=new int[2*B.length];
        for(int i=0;i<2*A.length;i++){
            A1[i]=A[k];
            B1[i]=B[k];
            k++;
            if(i==A.length-1){
                k=0;
            }
        }
        System.out.println(Arrays.toString(A1));
        System.out.println(Arrays.toString(B1));
        for(int p=0;p<2;p++){
            for(int i=0;i<A1.length;i++){
                if(A1[i] + rem < B1[i]){
                    l=0;
                }
                if(A1[i] + rem >=B1[i]){
                    l++;
                    if((A1[i]-B1[i]+rem)<0){
                        rem=-1*(A1[i]-B1[i]+rem);
                    }else rem=(A1[i]-B1[i]+rem);
                }
                if(l==1) j=i;
                if(l==A1.length){
                   break;
                } 
                
            }
            if(j==0) break;
        }
        if(l==A1.length) System.out.println(j);
        else System.out.println("-1");
	}
}
