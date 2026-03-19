class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);

        long sum = 0;
        long prev = 0;

        for (int num : nums) {
            if (num == prev) continue;
            long gap = num - prev - 1;
            if (gap > 0) {
                long take = Math.min(k, gap);
                long start = prev + 1;
                long end = prev + take;

                sum += (start + end) * take / 2;

                k -= take;

                if (k == 0) return sum;
            }

            prev = num;
        }

        long start = prev + 1;
        long end = prev + k;

        sum += (start + end) * k / 2;

        return sum;
    }
            


        }
