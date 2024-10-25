import java.io.*;
import java.util.*;

public class RotateNumberInverseRange {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int start = 1, end = 10;
        if( len>=2){
            int p = (int)Math.pow(10, len-1);
            start *= p;
            end *= p;
            end--;
        }
        //System.out.println(start + " " + end);
        for(int i=start; i<=end; i++){
            int num = i;
            int temp = num;
            int sum = 0;
            while( temp != 0){
                int rem = temp%10;
                temp = temp / 10;
                if(getNum(rem) ==-1){
                    break;
                }
                sum = (sum*10) + getNum(rem);
            }
            if(sum == num) System.out.print(num + " ");
        }
    }

    static int getNum(int x){
        if(x == 6) return 9;
        else if(x == 9) return 6;
        else if(x == 1 || x == 0 || x == 8) return x;
        return -1;
    }
}
