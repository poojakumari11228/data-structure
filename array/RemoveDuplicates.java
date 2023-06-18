package DataStructure.array;

import java.util.HashMap;

/* Remove duplicates from sorted array
*/
public class RemoveDuplicates {

	
// correct but not in sorted order
	
//    public int removeDuplicates(int[] nums) {
//        HashMap<Integer, Integer> data = new HashMap<>();
//        int count =0;
//
//        for(int i=0, j=nums.length-1; i<nums.length && i<=j; i++){
//            if(data.get(nums[i])==null){
//                data.put(nums[i],1);
//                count++;
//            }else{
//                swap(i,j, nums);
//                i--;
//                j--;
//            }
//        }
//        
//        return count;
//    }
    
	
	 public int removeDuplicates(int[] nums) {
		 
		 
		 return nums.length;
	 }
	
    public void swap(int i, int j, int[] nums){
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
    
    public static void main(String args[]) {
    	int[] nums = new int[] {1, 1, 2};
    	System.out.println(new RemoveDuplicates().removeDuplicates(nums));
    	
    }

}
