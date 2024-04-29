class ClearBit{
    public static void main(String[] s){
        //int number = 5;
        int num = 0B01011;
        int position = 1;
        int bitMask = 1 << position;
        int notBitMask = ~(bitMask);
        int newNum = (notBitMask & num);
        System.out.println(newNum);//  decimal 9
        System.out.println(Integer.toBinaryString(newNum));// 01001
    }
}