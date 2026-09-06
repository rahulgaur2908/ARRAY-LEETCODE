class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleZeroDups = 0;
        int lastIndex = arr.length - 1;

        for (int i = 0; i <= lastIndex - possibleZeroDups; i++) {
            if(arr[i] == 0) {
                // Edge Case.
                if( i == lastIndex - possibleZeroDups){
                    arr[lastIndex] = 0;
                    lastIndex -= 1;
                    break;
                }
                possibleZeroDups++;
            }
        }

        int newLastIndex = lastIndex - possibleZeroDups;

        for (int i = newLastIndex; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleZeroDups] = 0;
                possibleZeroDups--;
                arr[i + possibleZeroDups] = 0;
            }else {
                arr[i + possibleZeroDups] = arr[i];
            }
        }
    }
}