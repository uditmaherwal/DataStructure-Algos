/*
Two Sum

Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in increasing order.

Example 1
Input: nums = [1, 6, 2, 10, 3], target = 7
Output: [0, 1]
Explanation:
nums[0] + nums[1] = 1 + 6 = 7

Example 2
Input: nums = [1, 3, 5, -7, 6, -3], target = 0
Output: [1, 5]
Explanation:
nums[1] + nums[5] = 3 + (-3) = 0

Example 3
Input: nums = [-6, 7, 1, -7, 6, 2], target = 3
Output:
[2, 5]

*/

//SOLUTION 1 :

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}

//SOLUTION 2 :

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int n = nums.length;

    int[][] eleList = new int[n][2];

    for (int i = 0; i < n; i++) {
      eleList[i][0] = nums[i];
      eleList[i][1] = i;
    }

    Arrays.sort(eleList, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));

    int left = 0;
    int right = n-1;

    while(left < right){
        int sum = eleList[left][0] + eleList[right][0] ;
        if(sum == target){
            return new int[]{eleList[left][1], eleList[right][1]};
        }else if(sum < target){
            left++;
        }else{
            right--;
        }
    }
    return new int[]{-1, -1};
  }
}
