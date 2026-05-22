public class Solution
{
    public int MaxDistinctElements(int[] nums, int k)
    {
        Array.Sort(nums);

        int last = int.MinValue;
        int count = 0;

        foreach (int x in nums)
        {
            int candidate = Math.Max(last + 1, x - k);

            if (candidate <= x + k)
            {
                count++;
                last = candidate;
            }
        }

        return count;
    }
}