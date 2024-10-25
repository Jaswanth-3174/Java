import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        // odd - even
        int[] arr = {12, 11, 13, 14, 15, 20, 25};
        int start = 0 , end = arr.length - 1;
        while( start < end ){
            if(arr[start]%2 !=0 && arr[end]%2==0){
                // swap both
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }else if( arr[start] % 2 != 0){
                // left la odd, so need to change
                // but right la even, so dont need to change it
                // just move right pointer
                end--;
            }else{
                // right la odd, so need to change
                // but left la even, so dont need to change it
                // just move left pointer
                start++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
