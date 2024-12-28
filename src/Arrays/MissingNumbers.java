class MissingNumbers {
    long missingNumber(int arr[]) {
        int n = arr.length +1;
        long totalSum = (long) n * (n + 1) / 2;
        long arrSum = 0;

        for (int num : arr){
            arrSum += num;
        }
        return  totalSum - arrSum;
    }
}