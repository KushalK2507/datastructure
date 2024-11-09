package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SumOfTripletWithTargetSum {

    //Input: nums = [-1,0,1,2,-1,-4]
    //Output: [[-1,-1,2],[-1,0,1]]

    public static void main(String[] args){

        var result = threeSum(new int[]{-1,0,1,2,-1,-4});

        result.forEach(System.out::println);

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();
        for(int i=0;i<nums.length-1;i++){

            int sum = 0- nums[i];
            List<Integer> elements = new ArrayList<>();
            for(int j=i+1;j<nums.length;j++){
                int temp = sum - nums[j];
                if(elements.contains(temp)){
                    List<Integer> triplet = List.of(nums[i], nums[j], temp);
                    if(result.isEmpty()){
                        result.add(triplet);

                    }
                    else if(isToAdd(result, triplet)){
                        result.add(triplet);
                    }


                }
                elements.add(nums[j]);
            }

        }

        return result;
    }

    public static boolean isToAdd(List<List<Integer>> result, List<Integer>triplet){
        for(List<Integer> res : result){
            if((res.contains(triplet.get(0)) && res.contains(triplet.get(1)) && res.contains(triplet.get(2)))){

                return false;
            }

        }
        return true;
    }
}
