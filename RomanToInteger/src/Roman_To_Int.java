public class Roman_To_Int {
     public static void main(String[]args){

     }

     public int romanToInt(String s) {
       int number = 0;



       for (int i = 0; i < s.length(); i++){
           char first_ch = ch(s.charAt(i));
           char next_ch = ch(s.charAt(i+1));
       }
         char ch;


     }

    public char ch(char symbol) {
        int number = 0;

        switch (symbol){
            case "V":
                number = 5;
                break;
            case "X":
                number = 10;
                break;
            case "L":
                number = 50;
                break;
            case "C":
                number = 100;
                break;
            case "D":
                number = 500;
                break;
            case "M":
                number = 1000;
                break;
            default:
                number = 0;

        }
        return symbol;
    }

}
