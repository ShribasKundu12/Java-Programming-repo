class GetBit{
    public static void main(String[] s){
        int number = 5;
        int position = 2;
        int bitMask = 1 << position;
        if((bitMask & number) == 0){
            System.out.println("Bit is 0");
        }else{
            System.out.println("Bit is 1");//bit is 1
        }
    }
}