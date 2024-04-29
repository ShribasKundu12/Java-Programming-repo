class SetBit{
    public static void main(String[] s){
        int number = 5;
        int num = 0B0101;
        int position = 1;
        int bitMask = 1 << position;
        int newNum = (bitMask | number);
        System.out.println(newNum);//  decimal 7
        System.out.println(Integer.toBinaryString(newNum));// 111
    }
}