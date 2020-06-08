public class Roman_To_Int {
     public static void main(String[]args){
         System.out.println(romanToInt("MDCXCV"));
     }

     public static int romanToInt(String s) {
         int result = 0, first_ch, next_ch =0;
         for (int i = 0; i < s.length(); i++)
         {
             first_ch = value(s.charAt(i));
             if (i+1 < s.length()) {
                 next_ch = value(s.charAt(i + 1));

                 if (first_ch < next_ch) {
                     result += next_ch - first_ch;
                     i++;
                 } else result += first_ch;
             }
                    else result += first_ch;
         }
         return result;
     }

    private static int value(char symbol) {
          if (symbol == 'I') return 1;
          else if (symbol== 'V') return 5;
          else if (symbol == 'X') return 10;
          else if (symbol == 'L') return 50;
          else if (symbol == 'C') return 100;
          else if (symbol == 'D') return 500;
          else if (symbol == 'M') return 1000;
          else return 0;
     }

}
