public class findIndexMatchedElement {
    public static void main(String[] args) {
        int[] arr = {-10, -5, -4, -3 , 1, 5};
        System.out.println(bs(arr, 0 , 5));
    }
    static int bs(int[] arr, int start, int end){
        while( start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == mid){
                return mid;
            }else if(arr[mid]> mid){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
