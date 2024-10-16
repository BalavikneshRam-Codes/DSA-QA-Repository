import java.util.Collection;
import java.util.HashMap;

public class leetcode540 {
    public static void main(String args[]){
        int[] arr = {3,3,7,7,10,11,11};
        int result = singleNonDuplicate(arr);
        System.out.println(result);
    }
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> numHap = new HashMap<>();
        for(int i : nums){
            numHap.put(i, numHap.getOrDefault(i, 0) + 1);
        }
        for(int key:numHap.keySet()){
            if(numHap.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
