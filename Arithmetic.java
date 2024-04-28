class Arithmetic{
    public static void main(String[] s){
        int a = 10, b = 20;

        System.out.println("For a = 10 , b = 20");
        //System.out.println();
        int res = a + b;
        System.out.println("a + b = "+res);

        res = a - b;
        System.out.println("a - b = "+res);

        res = a * b;
        System.out.println("a * b = "+res);

        res = b / a;
        System.out.println("b / a = "+res);

        a = 28;
        b = 3;
        System.out.println("For a = 28 , b = 3");
        res = a % b;
        System.out.println("a % b = "+res);

    }
}
