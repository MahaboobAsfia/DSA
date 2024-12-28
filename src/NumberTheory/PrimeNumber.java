class PrimeNumber {
    static boolean isPrime(int n) {
        if (n<=1){
            return true;
        }

        for(int i = 2; i<=Math.sqrt(n); i++){
            if (n %i ==0){
                return false;
            }
        }
        return true;
    }
}