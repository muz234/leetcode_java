public class Palindrome {

    public static void  main(String[]args){
        System.out.println(isPalindrome(121));
    }
    
    
    public static boolean isPalindrome(int x){
        int number = 0; int check_num = x;
        if ( x < 0 ) return false;
        int reversed = 0;
        while(x != 0){
            reversed = x % 10 ;
            number = number * 10 + reversed;
            x /= 10;
        }

        return    check_num == number;

        
    }
    
}
