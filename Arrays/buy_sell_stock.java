class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int p=0;
        int diff=0;
        int ndiff=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            min=prices[i];

            ndiff=prices[i]-min;
            if(ndiff>diff)
            diff=ndiff;
        }
        return diff;
    }
}

//Complexity is  O(n) - Optimal Approach
