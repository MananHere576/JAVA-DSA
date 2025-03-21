//Brute Force O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
        
    }
}

//Better Approach O(n log n) Binary Search

// Best Optimal Approach O(n) using Hash Map

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];

            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);

        }
        return null;
    }
}




