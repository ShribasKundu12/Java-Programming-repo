
//Mutable and immutable string in java

class DemoString {
    public static void main (String[] args) {
        String str ="Hello";
        String s =str;
        str=str.concat(" Shribas");
        System.out.println(str);
        //Hello Shribas
    }
}

