import java.util.Scanner;
class UpdateBit{
    public static void main(String[] s){
        //int number = 5;
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();
        int num = 0B0101;
        int position = 1;
        int bitMask = 1 << position;
        int newNum;
        if(input == 1){
            //set bit
            newNum = (bitMask | num);
            System.out.println(newNum);// DEC 7 FOR POS 1
        }else{
            //clear bit
            int notBitMask = ~(bitMask);
            newNum  = (notBitMask & num);
            System.out.println(newNum);// DEC 1 FOR POS 2
        }
    }
}