import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 1, 1, 5, 6, 2, 2};

        // using collections hashmap
        HashMap<Integer, Integer> map = new HashMap<>(); // values, frequency
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        // without collections

        // 1. find the max element in arr
        int max = 0;
        for(int i : arr){
            max = Math.max(max, i);
        }

        // 2. declare the freq array with max + 1
        int[] freq = new int[max+1];

        // 3. traverse with array and increment the frequency
        for(int i : arr){
            freq[i]++;
        }

        // if freq > 0 , element is present
        // so print it
        for(int i = 0; i < freq.length; i++){
            if( freq[i] > 0) System.out.print( i + "->" + freq[i] + ", ");
        }
    }
}
