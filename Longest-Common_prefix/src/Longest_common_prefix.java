public class Longest_common_prefix {
    public static void main(String [] args){

        System.out.println(longestCommonPrefix(new String[]{"flower", "flow","flight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
     /*
        String temp_string, result_string;
       int len_arr = strs.length, i ,j, k;

       if (strs == null) return "";

       if (len_arr ==1 ) return strs[0];

       result_string = new String(strs[0]);
       for (i=1; i<len_arr; i++){
           temp_string = strs[i];
           for (j=0, k = 0; j<result_string.length() && k < temp_string.length(); j++ , k ++){
               if(result_string.charAt(j) != temp_string.charAt(k)) break;
           }
           if (j<result_string.length() && k < temp_string.length()) result_string = result_string.substring(0,j);
           else if (i == temp_string.length()) result_string = result_string.substring(0, k);
       }

       return result_string;
    */

        // Shorter version no overflow
        if (strs == null || strs.length == 0) return "";


        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
