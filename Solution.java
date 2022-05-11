/*Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.*/
//Sub array with given sum
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> num=new ArrayList<Integer>();
        int currsum=arr[0];
        int start=0;
        for(int i=1;i<n;i++)
        {
            while(currsum>s && i<n-1)
            {
                currsum=currsum-arr[start];
                start++;
            }
            if(currsum==s)
            {
                num.add(start);
                num.add(i-1);
            }
            if(i<n)
            {
                currsum=currsum+arr[i];
            }
        }
        return num;
    }
}
