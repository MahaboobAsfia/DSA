class PrintNTo1 {

    void printNos(int N) {
        // N to 1 without using loops
        if (N<1)return;
        System.out.print(N + " ");
        printNos(N-1);
    }
}