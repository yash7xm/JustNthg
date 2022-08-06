import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String W="ABCCED";
		System.out.println(check(board,W,0));
	}
    public static boolean check(char[][] b,String w,int k){
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                if(b[i][j]==w.charAt(k)){
                 chek(b,w,k+1,i,j,"");
            }
        }
    }
    return false;
    }
    private static void chek(char[][] b, String w, int k,int r, int c, String p){
        if(p.length()==w.length() || k==w.length()){
            System.out.println(p);
            return;
        }
        char ch=b[r][c];
        b[r][c]='@';
        if(r<b.length-1){
            if(b[r+1][c]==w.charAt(k)){
                chek(b,w,k+1,r+1,c,p+'D');
            }
        }
        if(r>0){
            if(b[r-1][c]==w.charAt(k)){
                chek(b,w,k+1,r-1,c,p+'R');
            }
        }
        if(c>0){
            if(b[r][c-1]==w.charAt(k)){
                chek(b,w,k+1,r,c-1,p+'L');
            }
        }
        if(c<b[r].length-1){
            if(b[r][c+1]==w.charAt(k)){
                chek(b,w,k+1,r,c+1,p+'R');
            }
        }
        b[r][c]=ch;
    }
}
