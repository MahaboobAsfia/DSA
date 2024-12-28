class PrintTable{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList table = new ArrayList<>();

        for(int i = 1; i<=10;i++){
            table.add(N*i);

        }
        return table;
    }
}