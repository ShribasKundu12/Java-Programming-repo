//String buffer - String Builder
public class StrBuff_StrBuilder {
    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer();
        //here default capacity for StringBuffer is 16
        System.out.println(strBuff.capacity());//16
        System.out.println(strBuff.length());//7

        StringBuffer strBuff1 = new StringBuffer("shribas");
        //here capacity will increase from 16 to 23
        System.out.println(strBuff.capacity());//23
        System.out.println(strBuff1.length());

        strBuff1.append(" kundu");
        System.out.println(strBuff1);//shribas kundu
        strBuff1.deleteCharAt(6);
        System.out.println(strBuff1);
        System.out.println(strBuff1);//shiba kundu

        strBuff1.insert(0,"I'm ");
        System.out.println(strBuff1);
        //I'm shriba kundu

        //strBuff1.capacity();
        System.out.println(strBuff1.capacity());//23

        String str = strBuff1.toString();
        System.out.println(str);//I'm shriba kundu
        //In summary, use StringBuffer when thread safety is required,
        // and use StringBuilder for better performance in single-threaded scenarios!!
    }
}