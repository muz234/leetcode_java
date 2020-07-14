import java.util.Stack;

public class Parentheses {

    public static void main(String[]args)
    {
        System.out.println(isValid("(}{}[]"));
    }

    public static boolean isValid(String s) {
        if(s != null || s.length() !=0) {
            Stack<Character> stack = new Stack<>();
             String left= "({[";
             String right = ")}]";
            for (int i = 0; i < s.length(); i++) {
                Character s_ch = s.charAt(i);
                if (s_ch == '(' || s_ch == '{' || s_ch == '[') stack.push(s_ch);
                else if(stack.isEmpty() || left.indexOf(stack.pop()) != right.indexOf(s_ch)) return false;
            }

            return stack.isEmpty();
        }

        return false;

    }


}
