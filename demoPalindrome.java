//check a number is palindrome or not
public class demoPalindrome{
    static void checkPalindrome(int n) {
        int remainder, rev = 0;
        int temp;
        temp = n;
        //make the number reverse
        while (n > 0) {
            remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n / 10;
        }
        if (rev == temp)
            System.out.println("palindrome!!");
        else
            System.out.println("not palindrome!!");
    }
    public static void main(String[] s){
        int number;
        number = 21233442;
        checkPalindrome(number);
    }
}