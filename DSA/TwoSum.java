/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Constraints:

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
*/


import java.util.*;

class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {
        
        int x=0;
        int y=1;
        int a=0;
        int b=0;
        
        int n=nums.length;
        
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            x=target-nums[i];
            map.put(y,x);
            y++;
        }
        
        for(int i=0;i<n;i++){
            if(map.containsValue(nums[i])){
                a=i;
                x=target-nums[i];
            }
            
        }
        
        for(int i=0;i<n;i++){
            if(x==nums[i]){
                b=i;
            }
        }
        
        int[] arr={a,b};
        return arr;
    }
    
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        
        int nums[]= new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        System.out.println("Enter the target value: ");
        int target=sc.nextInt();
       
        twoSum(nums,target);

        sc.close();
        
    }
}