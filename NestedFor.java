class Loop{
    public static void main(String[] s){
        int val = 5,i;
        //for(initialization; condition; increment/decrement){}
        for(i = 1; i<= val; i++) {
            for (int j = 1; j <= val; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}