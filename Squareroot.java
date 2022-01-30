public class SquareRoot {
    public int mySqrt(int x) {


        int start = 1;
        int end = x/2;
        int sqrt = start + (end - start)/2;
        
        if(x == 0){
            return 0;
        }
        while(start <= end){
            if(sqrt*sqrt == x){
                return sqrt;
            }else if(sqrt*sqrt > x){
                end = sqrt - 1;
            }else if(sqrt*sqrt < x){
                start = sqrt + 1;
            }
            sqrt = start + (end - start)/2;
        }
        if(sqrt*sqrt > x){
            return sqrt -1;
        }
        else{
            return sqrt;
        }
    }
}
