import java.util.*;
/*
111 T
230 F
606 F
609 T
69  T
99  F
121 F
101 T

*/
public class RotateNumberInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while( temp != 0){
            int rem = temp % 10;
            if(getNum(rem) == -1){
                System.out.println(false);
                return;
            }
            sum = (sum * 10) + getNum(rem);
            temp /= 10;
        }
        if( num == sum) System.out.println(true);
        else System.out.println(false);
    }

    static int getNum(int x){
        //if( x == 2 || x == 3 || x == 4 || x == 5)
        if( (x >= 2 && x<= 5) || x == 7) return -1;
        else if( x == 0 || x == 1 || x == 8) return x;
        else if(x == 6) return 9;
        return 6; // x == 9
    }

}
