class EquilibriumPoint {
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(int arr[]) {
        // code here
        int totalSum =0;
        int leftSum = 0;
        int n = arr.length;
        for(int i = 0; i<n;i++){
            totalSum += arr[i];
        }
        for(int i = 0; i<n;i++){
            int rightSum = totalSum - leftSum -arr[i];
            if(leftSum == rightSum){
                return i+1;

            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    }
}
