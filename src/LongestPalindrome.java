public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "ABACDDC"; // output 4
        String temp = "$";
        for(int i = 0; i<str.length(); i++){
            temp = temp + str.charAt(i) + '$';
        }
        System.out.println(temp);
        System.out.println("\n"+lps(temp));
    }

    static int lps(String temp){
        int maxLen = 0;
        int start = 0, end = 0;
        for(int i=1; i<temp.length()-1; i++){
            int currLen = 0;
            int l = i-1, r = i+1;
            while( l > 0 && r < temp.length()){
                if(temp.charAt(l) == temp.charAt(r)){
                    l--;
                    r++;
                    currLen++;
                }else break;
            }
            // System.out.println(temp.charAt(i) + " " +  currLen);
            //maxLen = Math.max(maxLen, currLen);
            if(maxLen < currLen){
                start = i - currLen+1;
                end = i + currLen-1;
                maxLen = currLen;
            }
        }
        //System.out.println(start + " " + end);
        for(int i = start; i<=end; i=i+2){
            System.out.print(temp.charAt(i));
        }
        return maxLen;
    }
}
