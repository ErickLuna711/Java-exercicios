package EX3;

public class TwoSum {
    static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6, sum = 0;
        for(int i = 0; i <= 2; i++){
            for(int j = 1; j <= 2; j++){
                if (nums[i] + nums[j] == target){
                    sum = nums[i] + nums[j];
                    System.out.println("Target found!" + nums[i] + nums[j] );
                    
                }
            }
            if(sum == target){
                break;
            }
        }

    }
}
