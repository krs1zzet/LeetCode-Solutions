class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int result= -1;
        int left = 0;
        int count = 0;

        for(int right = 0 ; right < n ; right++){
    if(arr[left] == arr[right]){
        count++;
    }
    else{
        if(count == arr[left]){
            result = arr[left];
        }
        left = right;
        count = 1; 
    }
}

if(count == arr[left]){
    result = arr[left];
}
        return result;
        
    }
}