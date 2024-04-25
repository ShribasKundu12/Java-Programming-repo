//Java Program to Swap Two Numbers.

class Swap{
    static public void main(String[] s) {

        //declare 2 variables
        int valueOne = 15;
        int valueTwo = 30;
        System.out.println("ValueOne = "+valueOne+" valueTwo = "+valueTwo);
        int temp;
        //swap
        temp = valueOne;
        valueOne = valueTwo;
        valueTwo  = temp;
        System.out.println("After Swapping");
        System.out.println("ValueOne = "+valueOne+" valueTwo = "+valueTwo);
    }

}