import java.util.Arrays;

public class Leetcode881 {
    public static void main(String args[]){
        int[] arr = {3,2,2,1};
        int result = numRescueBoats(arr,3);
        System.out.println(result);
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        while(left <= right){
            if(people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}
