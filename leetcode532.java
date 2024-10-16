import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leetcode532 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
    int result = findPairs(nums,1);
    System.out.println(result);
    }
    public static int findPairs(int[] nums, int k) {
        Map<Integer,Integer> numMap = new HashMap<>();
        if(k < 0) return 0;

        for(int i :nums){
            if(numMap.containsKey(i)){
                numMap.put(i,numMap.get(i)+1);
            }else{
                numMap.put(i,1);
            }
        }
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            int num = entry.getKey();

            if (k == 0) {
                if (entry.getValue() > 1) {
                    count++;
                }
            } else {
                if (numMap.containsKey(num + k)) {
                    count++;
                }
            }
        }
        return count;

    }
}
