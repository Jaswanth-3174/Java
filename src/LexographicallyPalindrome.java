/*
malayalam -> mala y alam
amma  ->  am ma
mama  -> ma ma  (also true) by sorting
*/
import java.util.*;
public class LexographicallyPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(lexographicallypalindrome(str));
    }
    static boolean lexographicallypalindrome(String str){
        int len = str.length();

        String temp1 = str.substring(0,len/2);
        String temp2;

        // take a odd testcase
        // malayalam -> len/2 gives mala | yalam
        // so (len/2 + 1) gives -> mala | alam
        if(len%2 == 0){
            temp2 = str.substring(len/2, len);
        }else{
            temp2 = str.substring(len/2 + 1 , len);
        }

        // we are use arraylist also
        char[] c1 = temp1.toCharArray();
        char[] c2 = temp2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));

        // when using arraylist, instead of this we can use
        // list1.equals(list2) -> returns boolean
        for(int i=0; i<len/2; i++){
            if(c1[i] != c2[i]) return false;
        }
        return true;
    }
}
