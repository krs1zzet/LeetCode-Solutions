class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % 3 != 0) return false;

        int target = totalSum / 3;
        int currSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == target) {
                count++;
                currSum = 0;
                if (count == 2 && i < arr.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
