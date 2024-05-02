class NesDoWhile{
    public static void main(String[] s){
        int x  = 5;
        int y;
        int S = 1;
        do{
            y  = 1;
            do{
                //y = 1;
                System.out.print(y);//1 2 3 4 5
                                    //1 2 3 4 5
                                    //1 2 3 4 5
                                    //1 2 3 4 5
                                    //1 2 3 4 5
                y++;
            }while(y<=x);//5<=5
            S++;
            System.out.println();
        }while(S <= x-1);
    }
}